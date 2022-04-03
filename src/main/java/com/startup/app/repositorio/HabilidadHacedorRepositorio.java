package com.startup.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.HabilidadHacedor;

@Repository
public interface HabilidadHacedorRepositorio extends JpaRepository<HabilidadHacedor, Integer>{

	
}
