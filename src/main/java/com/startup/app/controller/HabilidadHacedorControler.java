package com.startup.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.entidades.HabilidadHacedor;
import com.startup.app.service.HabilidadHacedorServicio;

@RestController
@RequestMapping("/api/habilidadHacedor")
@CrossOrigin({"*"})
public class HabilidadHacedorControler {
	
	@Autowired
	public HabilidadHacedorServicio habilidadHacedorServicio;
	
	//Crear Habiliadad del hacedor
	@PostMapping
	public ResponseEntity<?> crearHabilidadHacedor(@RequestBody HabilidadHacedor habilidadHacedor){
		return ResponseEntity.status(HttpStatus.CREATED).body(habilidadHacedorServicio.crearHabilidadHacedor(habilidadHacedor));
	}

}
