package com.projetobd.VacinaAnimal;

import com.projetobd.VacinaAnimal.payload.VacinaAnimalRequest;
import com.projetobd.VacinaAnimal.service.VacinaAnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vacina")
public class VacinaAnimalController {

    private VacinaAnimalService vacinaAnimalService;

    public VacinaAnimalController(VacinaAnimalService vacinaAnimalService) {
        this.vacinaAnimalService = vacinaAnimalService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody VacinaAnimalRequest vacinaAnimalRequest) {
        vacinaAnimalService.create(vacinaAnimalRequest);
    }

    @PatchMapping("{vacinaAnimalId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer vacinaAnimalId, @RequestBody VacinaAnimalRequest vacinaAnimalRequest) {
        vacinaAnimalService.update(vacinaAnimalId, vacinaAnimalRequest);
    }
}
