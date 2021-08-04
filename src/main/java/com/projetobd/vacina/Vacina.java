package com.projetobd.vacina;

import com.projetobd.VacinaAnimal.VacinaAnimal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade=CascadeType.PERSIST)
    VacinaAnimal vacinaAnimal;

    private String nome;
    private String marca;
    private Integer dosesAplicadas;

}
