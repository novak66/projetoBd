package com.projetobd.animal.payload;

import com.projetobd.endereco.payload.EnderecoRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalRequest {

    private String nome;
    private String tipo;
    private String porte;
    private String raca;
    private String cor;

    EnderecoRequest endereco;
}
