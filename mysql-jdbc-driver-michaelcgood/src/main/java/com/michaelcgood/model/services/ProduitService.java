package com.michaelcgood.model.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.michaelcgood.dao.ProduitRepository;
import com.michaelcgood.model.Produit;
@Service
@Transactional
public class ProduitService {
private final ProduitRepository a;
	
	public ProduitService(ProduitRepository ProduitRepository) {
		this.a=ProduitRepository;
		
		
	}
	public void SaveProduct(Produit P) {
		a.save(P);
	}
	public Produit showProduct(long id) {
		return a.findById(id);	}
}
