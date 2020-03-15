package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Jornada {

	private Date fecha;
	private Torneo torneo;
	private Collection partidos;
	
	public Jornada() {
		partidos = new ArrayList<Partido>();
	}
	
	//getters and setters

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	public Collection getPartidos() {
		return partidos;
	}

	public void setPartidos(Collection partidos) {
		this.partidos = partidos;
	}
	
	
}
