package com.saruman.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@Entity
@Component
@Table(name = "sarumanapi")
public class SarumanApi implements Serializable {

	private static final long serialVersionUID = -6888542263201514002L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "tipo", nullable = false)
	private Long tipoOrcs;

	@JsonSerialize(using = DateSerializer.class)
	@Column(name = "Região", nullable = false)
	private String regiao;


	public SarumanApi() {

	}

	public SarumanApi(Long id, String nome, Long tipoOrcs,  String regiao) {
		this.id = id;
		this.nome = nome;
		this.tipoOrcs = tipoOrcs;
		this.regiao = regiao;
		
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