package com.projetobd.VacinaAnimal.service;

import com.projetobd.VacinaAnimal.VacinaAnimal;
import com.projetobd.VacinaAnimal.VacinaAnimalFactory;
import com.projetobd.VacinaAnimal.VacinaAnimalRepository;
import com.projetobd.VacinaAnimal.payload.VacinaAnimalRequest;
import com.projetobd.animal.Animal;
import com.projetobd.animal.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VacinaAnimalServiceImpl implements VacinaAnimalService {

    private VacinaAnimalFactory vacinaAnimalFactory;
    private VacinaAnimalRepository vacinaAnimalRepository;

    public VacinaAnimalServiceImpl(VacinaAnimalFactory vacinaAnimalFactory,
                                   VacinaAnimalRepository vacinaAnimalRepository) {
        this.vacinaAnimalFactory = vacinaAnimalFactory;
        this.vacinaAnimalRepository = vacinaAnimalRepository;
    }

    @Override
    public void create(VacinaAnimalRequest vacinaAnimalRequest) {
        VacinaAnimal vacinaAnimal = vacinaAnimalFactory.create(vacinaAnimalRequest);

        vacinaAnimalRepository.save(vacinaAnimal);
    }

    @Override
    public void update(Integer vacinaAnimalId, VacinaAnimalRequest vacinaAnimalRequest) {

        VacinaAnimal vacinaAnimal = vacinaAnimalRepository.findById(vacinaAnimalId).orElse(null);

        if(vacinaAnimal != null) {
            vacinaAnimal = vacinaAnimalFactory.update(vacinaAnimal, vacinaAnimalRequest);
            vacinaAnimalRepository.save(vacinaAnimal);
        }

    }
}
