package com.projetobd.animal;

import com.projetobd.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String tipo;
    private String porte;
    private String raca;
    private String cor;

    @ManyToOne(cascade=CascadeType.PERSIST)
    Endereco endereco;
}
