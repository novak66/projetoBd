package com.projetobd.Endereco;

import com.projetobd.Endereco.payload.EnderecoRequest;
import com.projetobd.Endereco.service.EnderecoService;
import org.springframework.stereotype.Component;

@Component
public class EnderecoFactory {

    public Endereco create(EnderecoRequest enderecoRequest) {
        Endereco endereco = new Endereco();

        endereco.setEstado(enderecoRequest.getEstado());
        endereco.setCidade(enderecoRequest.getCidade());
        endereco.setBairro(enderecoRequest.getBairro());
        endereco.setCep(enderecoRequest.getCep());
        endereco.setNumero(enderecoRequest.getNumero());
        endereco.setComplemento(enderecoRequest.getComplemento());

        return endereco;
    }
}
