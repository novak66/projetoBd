package com.projetobd.VacinaAnimal.service;

import com.projetobd.VacinaAnimal.payload.VacinaAnimalRequest;

public interface VacinaAnimalService {

    void create(VacinaAnimalRequest vacinaAnimalRequest);

    void update(Integer vacinaAnimalId, VacinaAnimalRequest vacinaAnimalRequest);
}
