package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;

public class Estadio {

	private String nombre;
	private int capacidad;
	private String ciudad;
	
	private Collection equipo = new ArrayList<Equipo>();

	//getters and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Collection getEquipo() {
		return equipo;
	}

	public void setEquipo(Collection equipo) {
		this.equipo = equipo;
	}
	
	
}
