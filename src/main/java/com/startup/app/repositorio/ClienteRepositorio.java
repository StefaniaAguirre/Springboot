package com.startup.app.repositorio;

import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

	@Query(value = "select * from cliente as c where c.correo =:correo and c.contrasena = :contrasena", nativeQuery = true)
	Cliente loginCliente(String correo, String contrasena);
	
	@Query(value = "select t.nombre as nombreTarea, s.descripcion, s.precioServicio, s.pagoRealizado, s.tareaTerminada, o.esAceptada from cliente as c "
				 + "inner join servicio as s on c.idCliente = s.idCliente inner join tarea as t on s.idTarea = t.idTarea inner join oferta as o on s.idOferta = o.idOferta "
			     + "where c.idCliente = :idCliente", nativeQuery = true)
	List<Object[]> obtenerservicioCliente(int idCliente);
	
	@Query(value = "SELECT MAX(idCliente) AS id FROM cliente", nativeQuery = true)
	int obtenerUltimoCliente();
	
}
