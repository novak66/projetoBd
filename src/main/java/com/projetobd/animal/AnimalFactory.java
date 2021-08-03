package com.projetobd.animal;

import com.projetobd.animal.payload.AnimalRequest;
import com.projetobd.endereco.Endereco;
import com.projetobd.endereco.EnderecoFactory;
import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {

    private EnderecoFactory enderecoFactory;

    public AnimalFactory(EnderecoFactory enderecoFactory) {
        this.enderecoFactory = enderecoFactory;
    }

    public Animal create(AnimalRequest animalRequest) {
        Animal animal = new Animal();

        animal.setNome(animalRequest.getNome());
        animal.setCor(animalRequest.getCor());
        animal.setPorte(animalRequest.getPorte());
        animal.setRaca(animalRequest.getRaca());
        animal.setTipo(animalRequest.getTipo());

        Endereco endereco = enderecoFactory.create(animalRequest.getEndereco());

        animal.setEndereco(endereco);

        return animal;
    }
}
