package com.metrica.springboot.backend.apirest.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metrica.springboot.backend.apirest.models.dao.IClienteDao;
import com.metrica.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired //Inyecta el Cliente DAO
	private IClienteDao clienteDao;
	
	//Métodos creados por nosotros mismos en la interfaz del IClienteService, y
	//que implementamos aquí.
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Cliente save (Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		 clienteDao.deleteById(id);
	}

}
