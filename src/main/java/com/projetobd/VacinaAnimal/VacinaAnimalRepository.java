package com.projetobd.VacinaAnimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


public interface VacinaAnimalRepository extends JpaRepository <VacinaAnimal, Integer>,
        JpaSpecificationExecutor<VacinaAnimal> {

    @Query("select v from VacinaAnimal v "
            + "where v.animal.id = :animalId")
    VacinaAnimal animalVacinas(Integer animalId);

}
