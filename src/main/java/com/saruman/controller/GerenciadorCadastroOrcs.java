package com.saruman.controller;
import java.net.URI;
import java.util.List;


import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.saruman.service.sarumanservice;
import com.saruman.entities.SarumanApi;


@RestController
@RequestMapping("/api/viagens")

public class GerenciadorCadastroOrcs{

	

	@Autowired
	private sarumanservice sarumanservice;

	@PostMapping(path = "/new")
	public ResponseEntity<Response<SarumanApi>> cadastrar(@Valid @RequestBody CadastroOrcsDTO cadastroOrcsDTO, BindingResult result) {
		
		Response<SarumanApi> response = new Response<SarumanApi>();
	

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		SarumanApi cadastroSalvo = this.sarumanservice.salvar(cadastroOrcsDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cadastroOrcsDTO.getId())
				.toUri();	
		response.setData(cadastroSalvo);
		return ResponseEntity.created(location).body(response);
	}
	
	
	@GetMapping
	public ResponseEntity<List<SarumanApi>> listar() {
		List<SarumanApi> listasDecontrole =sarumanservice.listar();
		return ResponseEntity.status(HttpStatus.OK).body(listasDecontrole);
	}

	
}
	
	
		 

	















