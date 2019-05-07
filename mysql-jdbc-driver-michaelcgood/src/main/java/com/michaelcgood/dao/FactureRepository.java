package com.michaelcgood.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelcgood.model.Client;
import com.michaelcgood.model.Facture;
@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
//	public List<Facture> ShowFactureByClient_id(long id);

	public List<Facture> findAllByclientid(Integer  id);
	public Facture findByid(long Id); 

	
}
