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

	@Override
	public List<Cliente> Clientes() {
		return clienteRepository.findAll();
	}

	@Override
	public void update(Integer clienteId, ClienteRequest clienteRequest) {
		Cliente cliente = clienteRepository.findById(clienteId).orElse(null);

		cliente = clienteFactory.update(cliente, clienteRequest);

		clienteRepository.save(cliente);
	}

	@Override
	public void delete(Integer clienteId) {
		Cliente cliente = clienteRepository.findById(clienteId).orElse(null);

		if(cliente != null) {
			clienteRepository.delete(cliente);
		}
	}
}
