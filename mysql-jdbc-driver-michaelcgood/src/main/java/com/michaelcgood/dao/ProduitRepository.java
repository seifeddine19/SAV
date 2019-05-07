package com.michaelcgood.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelcgood.model.Produit;
@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

	
	public Produit findById(long id);
	
}
