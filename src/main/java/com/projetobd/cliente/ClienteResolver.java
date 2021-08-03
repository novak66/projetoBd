package com.projetobd.cliente;

import java.util.List;

import org.springframework.stereotype.Component;

import com.projetobd.cliente.service.ClienteService;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Component
@GraphQLApi
public class ClienteResolver {
	
	private ClienteService clienteService;
	
	public ClienteResolver(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GraphQLQuery
	public List<Cliente> Clientes() {
		return clienteService.Clientes();
	}

}
