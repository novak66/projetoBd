package com.projetobd.animal.service;

import com.projetobd.VacinaAnimal.VacinaAnimal;
import com.projetobd.VacinaAnimal.VacinaAnimalRepository;
import com.projetobd.animal.Animal;
import com.projetobd.animal.AnimalFactory;
import com.projetobd.animal.AnimalRepository;
import com.projetobd.animal.payload.AnimalRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private AnimalRepository animalRepository;
    private AnimalFactory animalFactory;
    private VacinaAnimalRepository vacinaAnimalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository,
                             AnimalFactory animalFactory,
                             VacinaAnimalRepository vacinaAnimalRepository) {
        this.animalRepository = animalRepository;
        this.animalFactory = animalFactory;
        this.vacinaAnimalRepository = vacinaAnimalRepository;
    }

    @Override
    public void create(AnimalRequest animalRequest) {
        Animal animal = animalFactory.create(animalRequest);

        animalRepository.save(animal);
    }

    @Override
    public List<Animal> animais() {
        return animalRepository.findAll();
    }

    @Override
    public List<Animal> animaisByCidade(String cidade) {
        return animalRepository.animaisByCidade(cidade);
    }

    @Override
    public VacinaAnimal animalVacinas(Integer animalId) {
        VacinaAnimal vacinaAnimal = vacinaAnimalRepository.animalVacinas(animalId);
        return vacinaAnimal;
    }

}
