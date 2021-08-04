package com.projetobd.vacina.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VacinaRequest {

    private String nome;
    private String marca;
    private Integer dosesAplicadas;
}
