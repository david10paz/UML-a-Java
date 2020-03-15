package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo {
	
	public enum Pais{
		
		ESCOCIA, FRANCIA, GALES, INGLATERRA, IRLANDA, ITALIA
		
	}
	
	private Pais nombre;
	private Collection visitante = new ArrayList<Partido>();
	private Collection local = new ArrayList<Partido>();
	
	//getters and setters
	
	public Pais getNombre() {
		return nombre;
	}
	public void setNombre(Pais nombre) {
		this.nombre = nombre;
	}
	public Collection getVisitante() {
		return visitante;
	}
	public void setVisitante(Collection visitante) {
		this.visitante = visitante;
	}
	public Collection getLocal() {
		return local;
	}
	public void setLocal(Collection local) {
		this.local = local;
	}

	
}
