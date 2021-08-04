package com.projetobd.VacinaAnimal;

import com.projetobd.animal.Animal;
import com.projetobd.vacina.Vacina;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class VacinaAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private Animal animal;

    @OneToMany(mappedBy = "vacinaAnimal", cascade=CascadeType.ALL, orphanRemoval = true)
    private List<Vacina> vacina;
}
