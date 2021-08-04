package com.projetobd.VacinaAnimal;

import com.projetobd.VacinaAnimal.payload.VacinaAnimalRequest;
import com.projetobd.animal.Animal;
import com.projetobd.animal.AnimalRepository;
import com.projetobd.vacina.Vacina;
import com.projetobd.vacina.VacinaFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class VacinaAnimalFactory {

    private VacinaFactory vacinaFactory;
    private AnimalRepository animalRepository;

    public VacinaAnimalFactory(VacinaFactory vacinaFactory, AnimalRepository animalRepository) {
        this.vacinaFactory = vacinaFactory;
        this.animalRepository = animalRepository;
    }

    public VacinaAnimal create(VacinaAnimalRequest vacinaAnimalRequest) {

        VacinaAnimal vacinaAnimal = new VacinaAnimal();

        Animal animal = animalRepository.findById(vacinaAnimalRequest.getAnimalId()).orElse(null);

        if(animal != null) {
            vacinaAnimal.setAnimal(animal);
        }
        List<Vacina> vacinas = vacinaAnimalRequest.getVacinas().stream()
                .map(vacina -> vacinaFactory.create(vacina, vacinaAnimal))
                .collect(Collectors.toList());

        vacinaAnimal.setVacina(vacinas);
        return vacinaAnimal;

    }

    public VacinaAnimal update(VacinaAnimal vacinaAnimal, VacinaAnimalRequest vacinaAnimalRequest) {

        List<Vacina> vacinas = vacinaAnimalRequest.getVacinas().stream()
                .map(vacina -> vacinaFactory.create(vacina, vacinaAnimal))
                .collect(Collectors.toList());

        vacinaAnimal.getVacina().clear();
        vacinaAnimal.getVacina().addAll(vacinas);

        return vacinaAnimal;
    }
}
