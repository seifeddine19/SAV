package com.michaelcgood.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michaelcgood.model.Client;
import com.michaelcgood.model.Login;
import com.michaelcgood.model.services.LoginService;

@Controller
public class LoginController {
	LoginService loginservice ; 
	Login L ;
	Client C ;
	@RequestMapping("/Login")

	public String login() {
		//System.out.println("hi");
		return "Login.jsp";
	}
/*	@RequestMapping("login-client")
	public String loginclient(@ModelAttribute Login client, HttpServletRequest request) {
		
		if(loginservice.findByusernameAndPassword(L.getLogin(), L.getMdp())!=null) {
			return "homepage";
		}
		else {
			request.setAttribute("erroe", "Invalid Username Or Password");
			return "fail";
		}
	*/
	
}
