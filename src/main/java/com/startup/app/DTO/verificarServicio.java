package com.startup.app.DTO;

public class verificarServicio {

	public double  precioHabilidad;
    public int idHacedor;
    
    
	public verificarServicio(double precioHabilidad, int idHacedor) {
		super();
		this.precioHabilidad = precioHabilidad;
		this.idHacedor = idHacedor;
	}
	public double getPrecioHabilidad() {
		return precioHabilidad;
	}
	public void setPrecioHabilidad(double precioHabilidad) {
		this.precioHabilidad = precioHabilidad;
	}
	public int getIdHacedor() {
		return idHacedor;
	}
	public void setIdHacedor(int idHacedor) {
		this.idHacedor = idHacedor;
	}
    
}
