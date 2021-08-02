package com.projetobd.cliente;

import com.projetobd.Endereco.Endereco;
import com.projetobd.Endereco.EnderecoFactory;
import org.springframework.stereotype.Component;

import com.projetobd.cliente.clientepayload.ClienteRequest;

@Component
public class ClienteFactory {

	private EnderecoFactory enderecoFactory;

	public ClienteFactory(EnderecoFactory enderecoFactory) {
		this.enderecoFactory = enderecoFactory;
	}
	
	public Cliente create(ClienteRequest clienteRequest) {
		Cliente cliente = new Cliente();

		cliente.setNome(clienteRequest.getNome());
		cliente.setCpf(clienteRequest.getCpf());

		Endereco endereco = enderecoFactory.create(clienteRequest.getEndereco());

		cliente.setEndereco(endereco);

		return cliente;
	}

}
