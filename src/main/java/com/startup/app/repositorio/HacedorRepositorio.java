package com.startup.app.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Hacedor;

@Repository
public interface HacedorRepositorio extends JpaRepository<Hacedor, Integer> {

	@Query(value = "SELECT h.nombre, h.edad, t.nombre as nombreTarea, t.definicion, ht.precioHabilidad, t.idTarea FROM hacedor AS h "
			     + "INNER JOIN habilidadtareahacedor AS ht ON h.idHacedor = ht.idHacedor "
			     + "INNER JOIN tarea AS t ON ht.idTarea = t.idTarea WHERE h.idHacedor = :idHacedor", nativeQuery = true)
	List<Object[]> listarDetalleHacedor(int idHacedor);
	
	@Query(value = "select * from hacedor as h where h.correo = :correo and h.contrasena = :contrasena", nativeQuery = true)
	Hacedor loginHacedor(String correo, String contrasena);
	
	@Query(value = "SELECT MAX(idHacedor) AS id FROM hacedor", nativeQuery = true)
	int obtenerUltimoHacedor();
}
