package com.metrica.springboot.backend.apirest.models.services;

import java.util.List;

import com.metrica.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List <Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente); //Guarda un Cliente
	
	public void delete(Long id); //Borrar por ID
}
