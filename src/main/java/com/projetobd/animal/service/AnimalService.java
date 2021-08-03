package com.projetobd.animal.service;

import com.projetobd.animal.Animal;
import com.projetobd.animal.payload.AnimalRequest;

import java.util.List;

public interface AnimalService {

    void create(AnimalRequest animalRequest);

    List<Animal> animais();

    List<Animal> animaisByCidade(String cidade);
}
