package com.projetobd.endereco.service;

import com.projetobd.endereco.Endereco;
import com.projetobd.endereco.EnderecoFactory;
import com.projetobd.endereco.EnderecoRepository;
import com.projetobd.endereco.payload.EnderecoRequest;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private EnderecoFactory enderecoFactory;
    private EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoFactory enderecoFactory,
                               EnderecoRepository enderecoRepository) {
        this.enderecoFactory = enderecoFactory;
        this.enderecoRepository = enderecoRepository;
    }
    @Override
    public void create(EnderecoRequest enderecoRequest) {
        Endereco endereco = enderecoFactory.create(enderecoRequest);

        enderecoRepository.save(endereco);
    }
}
