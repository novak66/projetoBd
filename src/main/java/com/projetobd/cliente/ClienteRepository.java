package com.projetobd.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>, JpaSpecificationExecutor<Cliente> {

}
