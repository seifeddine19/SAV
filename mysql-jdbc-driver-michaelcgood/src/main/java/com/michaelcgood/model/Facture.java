package com.michaelcgood.model;



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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "Facture")
public class Facture {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private long id ;
private String aujourdhui ;
private int clientid;
private int produitid;
//private Client C ;
//private Produit P ;


public long getId() {
	return id;
}
public Facture() {
	
}

public Facture(long id, String aujourdhui) {
	super();
	this.id = id;
	this.aujourdhui = aujourdhui;
	
}

public Facture(long id, String aujourdhui, int client_id, int produit_id) {
	super();
	this.id = id;
	this.aujourdhui = aujourdhui;
	this.clientid = client_id;
	this.produitid = produit_id;
}
public void setId(long id) {
	this.id = id;
}
public String getAujourdhui() {
	return aujourdhui;
}
public void setAujourdhui(String aujourdhui) {
	this.aujourdhui = aujourdhui;
}
@Override
public String toString() {
	return "Facture [id=" + id + ", aujourdhui=" + aujourdhui + "]";
}
public int getClient_id() {
	return clientid;
}
public void setClient_id(int client_id) {
	this.clientid = client_id;
}
public int getProduit_id() {
	return produitid;
}
public void setProduit_id(int produit_id) {
	this.produitid = produit_id;
}


/*@ManyToMany(fetch = FetchType.LAZY,
cascade = {
    CascadeType.PERSIST,
    CascadeType.MERGE
})
@JoinTable(name = "Facture",joinColumns = { @JoinColumn(name = "Client_id") },
inverseJoinColumns = { @JoinColumn(name = "Produit_id") })
private Set<Facture> Facture = new HashSet<>();*/

}
