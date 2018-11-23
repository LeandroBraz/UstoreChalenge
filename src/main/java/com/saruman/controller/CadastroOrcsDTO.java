package com.saruman.controller;


import java.io.Serializable;


public class CadastroOrcsDTO implements Serializable {

	private static final long serialVersionUID = -8105241933692707649L;
	private Long id;
	
	private String nome;
	
	private Long tipoOrcs;
	
	private String regiao;
	
	public CadastroOrcsDTO() {

	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getTipoOrcs() {
		return tipoOrcs;
	}


	public void setTipoOrcs(Long tipoOrcs) {
		this.tipoOrcs = tipoOrcs;
	}


	public String getRegiao() {
		return regiao;
	}


	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "orcs [id=" + id + ", nome=" + nome + ", tipoOrcs=" + tipoOrcs
				+ ", regiao=" + regiao  + "]";
	}
}






