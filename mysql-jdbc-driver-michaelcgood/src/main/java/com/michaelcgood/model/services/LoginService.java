package com.michaelcgood.model.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.michaelcgood.model.Client;
import com.michaelcgood.model.Facture;
import com.michaelcgood.model.Login;
import com.michaelcgood.dao.ClientRepository;
import com.michaelcgood.dao.LoginRepository;
@Service
@Transactional
public class LoginService {

	private final LoginRepository LoginRepository;
	
	public LoginService(LoginRepository LoginRepository) {
		this.LoginRepository=LoginRepository;
	}
	public void saveMyUser(Login client) {
	
		
		LoginRepository.save(client);
	}

	/*public Login findById(long id) {
		return LoginRepository.findById(id);
	}*/
public Login findByloginAndMdp(String username,String Mdp) {
	return LoginRepository.findByloginAndMdp(username, Mdp);
}
public Login findbyId(Integer Id) {
	return LoginRepository.findByid(Id);
}


}
