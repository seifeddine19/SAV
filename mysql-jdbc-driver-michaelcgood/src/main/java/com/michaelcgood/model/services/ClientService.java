package com.michaelcgood.model.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.michaelcgood.dao.ClientRepository;
import com.michaelcgood.model.Client;


@Service
@Transactional
public class ClientService {
private final ClientRepository ClientRepositry ;
	
	public ClientService(ClientRepository ClientRepositry) 
	{
		this.ClientRepositry= ClientRepositry;
	}
	
	public Client findClient(Integer id) {
		return ClientRepositry.findByid(id);
	}
}
