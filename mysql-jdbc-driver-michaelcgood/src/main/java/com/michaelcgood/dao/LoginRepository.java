package com.michaelcgood.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelcgood.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {
 
  
  public Login findByloginAndMdp(String username,String Mdp);

	public Login findByid(Integer id);
}
