package com.projetobd.animal;

import com.projetobd.animal.payload.AnimalRequest;
import com.projetobd.animal.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody AnimalRequest animalRequest) {
        animalService.create(animalRequest);
    }
}
