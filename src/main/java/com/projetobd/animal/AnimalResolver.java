package com.projetobd.animal;

import com.projetobd.animal.service.AnimalService;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@GraphQLApi
public class AnimalResolver {

    private AnimalService animalService;

    public AnimalResolver(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GraphQLQuery
    public List<Animal> animais() {
        return animalService.animais();
    }

    @GraphQLQuery
    public List<Animal> animaisByCidade(String cidade) {
        return animalService.animaisByCidade(cidade);
    }
}
