package com.saruman.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.saruman.entities.SarumanApi;




@Repository
public interface CadastroRepository extends JpaRepository<SarumanApi, Long> {

	SarumanApi findByLocalDeDestino(String regiao);

}


