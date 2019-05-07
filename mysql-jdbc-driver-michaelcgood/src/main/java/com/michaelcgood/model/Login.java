package com.michaelcgood.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;



@Entity
@Table(name = "Login")
public class Login extends Client {
	

	
	@Column(name = "login")
	private String login;
	
	@Column(name = "mdp")
	private String mdp;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Login(String nom, int telephone, String email, String login, String mdp) {
		super(nom, telephone, email);
		this.login = login;
		this.mdp = mdp;
	}

	public Login() {

	}
}
