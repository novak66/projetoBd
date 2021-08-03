package com.projetobd.cliente.service;

import java.util.List;

import com.projetobd.cliente.Cliente;
import com.projetobd.cliente.payload.ClienteRequest;

public interface ClienteService {
	
	void create(ClienteRequest clienteRequest);
	
	List<Cliente> Clientes();

}
