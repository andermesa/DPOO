package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

public class Vuelo {
	
	
	private String fecha;
	
	
	
	public Vuelo(String fecha2, String fecha, String nombreAvion) {
		
		
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public Object getCodigoRuta() {
		// TODO Auto-generated method stub
		return null;
	}



	public Collection<? extends uniandes.dpoo.aerolinea.tiquetes.Tiquete> getTiquetes() {
		// TODO Auto-generated method stub
		return null;
	}



	public int getCantidadAsientosDisponibles() {
		// TODO Auto-generated method stub
		return 0;
	}



	public void agregarTiquete(uniandes.dpoo.aerolinea.tiquetes.Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}



	public void marcarComoRealizado() {
		// TODO Auto-generated method stub
		
	}



	
	
}