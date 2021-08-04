package com.projetobd.cliente.service;

import java.util.List;

import com.projetobd.cliente.Cliente;
import com.projetobd.cliente.payload.ClienteRequest;

public interface ClienteService {
	
	void create(ClienteRequest clienteRequest);

	void update(Integer clienteId, ClienteRequest clienteRequest);

	void delete(Integer clienteId);

	List<Cliente> Clientes();
}
