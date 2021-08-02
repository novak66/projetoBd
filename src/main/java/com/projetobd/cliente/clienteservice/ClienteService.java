package com.projetobd.cliente.clienteservice;

import java.util.List;

import com.projetobd.cliente.Cliente;
import com.projetobd.cliente.clientepayload.ClienteRequest;

public interface ClienteService {
	
	void create(ClienteRequest clienteRequest);
	
	List<Cliente> Clientes();

}
