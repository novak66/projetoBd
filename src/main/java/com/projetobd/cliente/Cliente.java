package com.projetobd.cliente;

import javax.persistence.*;

import com.projetobd.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String cpf;

	@ManyToOne(cascade=CascadeType.PERSIST)
	Endereco endereco;
}
