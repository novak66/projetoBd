package com.projetobd.vacina;

import com.projetobd.VacinaAnimal.VacinaAnimal;
import com.projetobd.vacina.payload.VacinaRequest;
import org.springframework.stereotype.Component;

@Component
public class VacinaFactory {

    public Vacina create(VacinaRequest vacinaRequest, VacinaAnimal vacinaAnimal) {
        Vacina vacina = new Vacina();

        vacina.setNome(vacinaRequest.getNome());
        vacina.setMarca(vacinaRequest.getMarca());
        vacina.setDosesAplicadas(vacinaRequest.getDosesAplicadas());
        vacina.setVacinaAnimal(vacinaAnimal);

        return vacina;
    }
}
