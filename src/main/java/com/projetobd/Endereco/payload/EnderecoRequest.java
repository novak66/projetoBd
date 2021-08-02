package com.projetobd.Endereco.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoRequest {

    private String estado;
    private String cidade;
    private String bairro;
    private String numero;
    private String complemento;
    private String cep;
}
