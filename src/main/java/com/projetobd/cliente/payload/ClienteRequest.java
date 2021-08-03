package com.projetobd.cliente.payload;

import com.projetobd.endereco.payload.EnderecoRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {
	
	private String nome;
	private String cpf;

	EnderecoRequest endereco;
}
