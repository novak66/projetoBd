package com.projetobd.cliente;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.projetobd.cliente.payload.ClienteRequest;
import com.projetobd.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void create(@RequestBody ClienteRequest clienteRequest ) {
		clienteService.create(clienteRequest);
	}
	
	
}
  