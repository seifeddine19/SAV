package com.michaelcgood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;
@Entity
@Table(name = "Client")
public class Client { 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id ;
	
	private String Nom ;
	private int Telephone ;
	private String Email ;
	
	public Client( String nom, int telephone, String email) {
		super();
		
		Nom = nom;
		Telephone = telephone;
		Email = email;
	}
	
	public Client() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", Nom=" + Nom + ", Telephone=" + Telephone + ", Email=" + Email + "]";
	} 
	  @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            })
	    @JoinTable(name = "Facture",
	            joinColumns = { @JoinColumn(name = "Clientid") },
	            inverseJoinColumns = { @JoinColumn(name = "Produitid") })
	    private Set<Produit> produits = new HashSet<>();
	
}
