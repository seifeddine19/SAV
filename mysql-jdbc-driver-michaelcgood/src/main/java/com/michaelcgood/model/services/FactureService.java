package com.michaelcgood.model.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.michaelcgood.dao.FactureRepository;
import com.michaelcgood.model.Facture;
@Service
@Transactional
public class FactureService {

	private final FactureRepository facturerepository ;
	
	public FactureService(FactureRepository facturerepository) 
	{
		this.facturerepository= facturerepository;
	}
	
	public List<Facture> showAllFacture(){
		List<Facture> factures = new ArrayList<Facture>();
		for(Facture facture: facturerepository.findAll() ) {
			factures.add(facture);
		}
		System.out.println(factures.size());
		return factures;
	}
	public Facture showFacture(int id) {
		
		return facturerepository.findByid(id);
	}
	public Facture showFact(long id) {
		return facturerepository.findByid(id);
	}
/*	public List<Facture> ShowFactureByClient_id(int id){
		List<Facture> fact = new ArrayList<Facture>();
		for(Facture facture: facturerepository.ShowFactureByClient_id(id)) {
			fact.add(facture);
		}
		return fact;
	}*/
	public List<Facture> ShowFactureByClient_id(Integer  id){
		List<Facture> fact = new ArrayList<Facture>();
		for(Facture facture: facturerepository.findAllByclientid(id)) {
			fact.add(facture);
		}
		return fact;
	}
}
