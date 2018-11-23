package com.saruman.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saruman.controller.CadastroOrcsDTO;
import com.saruman.controller.CadastroRepository;
import com.saruman.entities.SarumanApi;


@Service
public class sarumanservice {

	@Autowired
	private CadastroRepository cadastroRepository;

	public List<SarumanApi> listar() {
		return cadastroRepository.findAll();
	}

	public SarumanApi salvar(CadastroOrcsDTO cadastroOrcsDTO) {

		SarumanApi sarumanApi = new SarumanApi();
		
		sarumanApi.setId(cadastroOrcsDTO.getId());
		sarumanApi.setNome(cadastroOrcsDTO.getNome());
		sarumanApi.setRegiao(cadastroOrcsDTO.getRegiao());
		sarumanApi.setTipoOrcs(cadastroOrcsDTO.getTipoOrcs());
		return cadastroRepository.save(sarumanApi);
		
		
		
	}

	
	
	
}


