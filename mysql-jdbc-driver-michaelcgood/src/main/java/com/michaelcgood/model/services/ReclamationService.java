package com.michaelcgood.model.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.michaelcgood.dao.ReclamationRepository;
import com.michaelcgood.model.Reclamation;

@Service
@Transactional
public class ReclamationService {
private final ReclamationRepository Reclamationrepo;

public ReclamationService(ReclamationRepository Reclamationrepo) {
	this.Reclamationrepo = Reclamationrepo;
}
public void saveReclamation(Reclamation rec) {
	Reclamationrepo.save(rec);
}
}
