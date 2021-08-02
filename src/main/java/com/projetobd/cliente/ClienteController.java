package com.projetobd.cliente;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.projetobd.cliente.clientepayload.ClienteRequest;
import com.projetobd.cliente.clienteservice.ClienteService;

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
  