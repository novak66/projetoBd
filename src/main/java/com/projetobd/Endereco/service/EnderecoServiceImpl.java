package com.projetobd.Endereco.service;

import com.projetobd.Endereco.Endereco;
import com.projetobd.Endereco.EnderecoFactory;
import com.projetobd.Endereco.EnderecoRepository;
import com.projetobd.Endereco.payload.EnderecoRequest;
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
