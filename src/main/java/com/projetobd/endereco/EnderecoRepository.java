package com.projetobd.endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>, JpaSpecificationExecutor<Endereco> {
}
