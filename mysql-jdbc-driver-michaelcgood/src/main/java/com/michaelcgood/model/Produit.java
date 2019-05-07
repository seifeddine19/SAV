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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Produit")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	private String Nom;
	private int Qte;
	
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
	public int getQte() {
		return Qte;
	}
	public void setQte(int qte) {
		Qte = qte;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", Nom=" + Nom + ", Qte=" + Qte + "]";
	}
	 @ManyToMany
	 @JoinColumn(name = "id_client")
	private Set<Client> clients = new HashSet<>();

	 
	public Produit(long id, String nom, int qte) {
		super();
		this.id = id;
		Nom = nom;
		Qte = qte;
	} 
	 
	public Produit() {
		
	}
}
