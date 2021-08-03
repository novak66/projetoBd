package com.projetobd.cliente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetobd.cliente.Cliente;
import com.projetobd.cliente.ClienteFactory;
import com.projetobd.cliente.ClienteRepository;
import com.projetobd.cliente.payload.ClienteRequest;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	private ClienteRepository clienteRepository;
	private ClienteFactory clienteFactory;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository, ClienteFactory clienteFactory) {
		this.clienteFactory = clienteFactory;
		this.clienteRepository = clienteRepository;
	}

	@Override
	public void create(ClienteRequest clienteRequest) {
		Cliente cliente = clienteFactory.create(clienteRequest);
		
		clienteRepository.save(cliente);
	}
	
	public List<Cliente> Clientes() {
		return clienteRepository.findAll();
	}
	
	

}
