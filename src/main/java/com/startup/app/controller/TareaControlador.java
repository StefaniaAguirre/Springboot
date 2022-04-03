package com.startup.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.entidades.Tarea;
import com.startup.app.service.TareaServicio;

@RestController
@RequestMapping("/api/tarea")
@CrossOrigin({"*"})
public class TareaControlador {

	@Autowired
	public TareaServicio tareaServicio;
	
	@GetMapping("/listarTareas")
	public ResponseEntity<?> listarTareas(){
		List<Tarea> listaTareas = tareaServicio.listarTareas();
		
		if(listaTareas.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(listaTareas);
	}
	
	@GetMapping("/obtenerTarea/{nombreTarea}")
	public ResponseEntity<?> obtenerIdTarea(@PathVariable String nombreTarea){
		
		Tarea tarea = tareaServicio.obtenerIdTarea(nombreTarea);
		
		if(tarea == null) {
			return null;
		}
		return ResponseEntity.ok(tarea);
		
	}
	

}
