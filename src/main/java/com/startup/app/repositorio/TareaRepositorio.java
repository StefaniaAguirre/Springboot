package com.startup.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Tarea;

@Repository
public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {

	@Query(value = "select * from tarea as t where t.nombre = :nombreTarea", nativeQuery = true)
	Tarea obtenerIdTarea(String nombreTarea);
}
