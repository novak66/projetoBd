package com.projetobd.cliente.clientepayload;

import com.projetobd.Endereco.payload.EnderecoRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {
	
	private String nome;
	private String cpf;

	EnderecoRequest endereco;
}
