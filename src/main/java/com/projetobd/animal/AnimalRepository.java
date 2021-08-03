package com.projetobd.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository <Animal, Integer>, JpaSpecificationExecutor<Animal> {

    @Query("select a from Animal a "
            + "where a.endereco.cidade = :animalCidade")
    List<Animal> animaisByCidade(String animalCidade);

}
