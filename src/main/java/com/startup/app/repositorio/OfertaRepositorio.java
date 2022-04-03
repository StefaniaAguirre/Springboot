package com.startup.app.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Oferta;

@Repository
public interface OfertaRepositorio extends JpaRepository<Oferta, Integer> {

	
	
	//Consultar solicitudes de servicios para las que un hacedor cumple las condiciones
		@Query(value = "SELECT o.idOferta, t.nombre, o.notificacion, o.esAceptada,  o.tiempoVida, o.precioBase FROM hacedor AS h"
				+ "	INNER JOIN habilidadtareahacedor AS ht ON h.idHacedor = ht.idHacedor"
				+ "	INNER JOIN tarea AS t ON ht.idTarea = t.idTarea"
				+ "	INNER JOIN servicio AS s ON s.idTarea = t.idTarea "
				+ "	INNER JOIN oferta AS o ON s.idOferta = o.idOferta WHERE h.idHacedor = :idHacedor and t.idTarea =  :idTarea", nativeQuery = true)
		List<Object[]> listarOfertasDelHacedor(int idHacedor, int idTarea);
	
		//consultar las ofertas creadas por el cliente donde existen hacedores para realizar las tareas
		@Query (value = "SELECT s.idServicio, o.idOferta, o.notificacion, o.esAceptada, o.precioBase FROM cliente AS c\r\n"
				+ "INNER JOIN servicio AS s ON s.idCliente = c.idCliente\r\n"
				+ "INNER JOIN oferta AS o ON o.idOferta = s.idOferta\r\n"
				+ "WHERE c.idCliente = :idCliente AND o.esAceptada = 1", nativeQuery = true)
		List<Object[]> listarOfertasClientes(int idCliente);
}
