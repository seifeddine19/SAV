package com.michaelcgood.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reclamation")
public class Reclamation {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
private int id ;
private String Description ;
private String Date;
private int Facture_id ;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}


public int getFacture_id() {
	return Facture_id;
}
public void setFacture_id(int facture_id) {
	Facture_id = facture_id;
}
public Reclamation(int id, String description, String date, int fact) {
	super();
	this.id = id;
	Description = description;
	Date = date;
	this.Facture_id = fact;

}

public Reclamation() {
	
}
}


