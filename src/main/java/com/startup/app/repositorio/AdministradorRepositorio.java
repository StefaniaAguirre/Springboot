package com.startup.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Administrador;

@Repository
public interface AdministradorRepositorio extends JpaRepository<Administrador, Long> {

	@Query(value = "select * from administrador as a where a.correo =:correo and a.contrasena =:contrasena", nativeQuery = true)
	Administrador loginAdministrador(String correo, String contrasena); 
}
