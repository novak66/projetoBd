package com.projetobd.VacinaAnimal.payload;

import com.projetobd.vacina.payload.VacinaRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VacinaAnimalRequest {

    private List<VacinaRequest> vacinas;
    private Integer animalId;
}
