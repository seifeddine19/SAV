package com.michaelcgood.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelcgood.model.Client;
import com.michaelcgood.model.Login;
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

public Client findByid(Integer id);
}
