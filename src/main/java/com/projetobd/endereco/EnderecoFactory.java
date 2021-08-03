package com.projetobd.endereco;

import com.projetobd.endereco.payload.EnderecoRequest;
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
