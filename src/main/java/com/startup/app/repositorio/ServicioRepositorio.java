package com.startup.app.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.startup.app.DTO.verificarServicio;
import com.startup.app.entidades.Servicio;

@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio, Integer>{

	//Consultar solicitudes de servicios para las que un hacedor cumple las condiciones
	@Query(value = "SELECT h.nombre, s.item, s.precioServicio, t.nombre as nombreTarea, s.descripcion FROM hacedor AS h "
			+ "INNER JOIN habilidadtareahacedor AS ht ON h.idHacedor = ht.idHacedor "
			+ "INNER JOIN tarea AS t ON ht.idTarea = t.idTarea "
			+ "INNER JOIN servicio AS s ON s.idTarea = t.idTarea WHERE h.idHacedor = :idHacedor and t.idTarea = :idTarea", nativeQuery = true)
	List<Object[]> listarDetalleServicio(int idHacedor, int idTarea);
	
	//Consultar detalle de un servicio aceptado
	@Query(value = "SELECT t.nombre as nombreTarea, s.descripcion, o.precioBase, o.notificacion FROM servicio AS s "
			+ "INNER JOIN oferta AS o ON o.idOferta = s.idOferta " 
			+ "INNER JOIN tarea AS t ON s.idTarea = t.idTarea WHERE s.idServicio=:idServicio and o.esAceptada=1", nativeQuery = true)
	List<String> detalleServicioAceptado(int idServicio);
	
	//Consultar si hay hacedores que cumplen con la tarea del servicio solicitado
	@Query(value = "select ht.idHacedor, ht.precioHabilidad from tarea as t inner Join habilidadtareahacedor as ht on t.idTarea = ht.idTarea where t.idTarea =:idTarea", nativeQuery = true)
	List<Object[]> verificarServicioSolicitado(int idTarea);
}
