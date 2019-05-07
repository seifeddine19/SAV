package com.michaelcgood.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.michaelcgood.model.Login;
import com.michaelcgood.model.services.LoginService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private LoginService loginService;  

	@GetMapping("/")
	public String hello() {
		return "Bienvenu Dans Notre Application";
	}
	@GetMapping("/saveclient")
	public String saveclient(@RequestParam String Nom ,@RequestParam int telephone , @RequestParam String Email , @RequestParam String login , @RequestParam String MotdePass ) {
		Login user = new Login(Nom,telephone,Email,login,MotdePass);
		loginService.saveMyUser(user);
		return "Client saved";
	}
}
