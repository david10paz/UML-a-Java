package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;

public class Partido {

	private int puntosLocal;
	private int puntosVisitantes;
	private int bonusLocal;
	private int bonusVisitante;
	private Jornada jornada;
	
	public void resultado() {
		System.out.println("Resultado: Equipo 1 -->" + (puntosLocal + bonusLocal) + " / Equipo 2 ---> " + (puntosVisitantes + bonusVisitante));
	}
	
	private Collection estadio = new ArrayList<Estadio>();

	
	//getters and setters
	
	public int getPuntosLocal() {
		return puntosLocal;
	}

	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}

	public int getPuntosVisitantes() {
		return puntosVisitantes;
	}

	public void setPuntosVisitantes(int puntosVisitantes) {
		this.puntosVisitantes = puntosVisitantes;
	}

	public int getBonusLocal() {
		return bonusLocal;
	}

	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}

	public int getBonusVisitante() {
		return bonusVisitante;
	}

	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}

	public Jornada getJornada() {
		return jornada;
	}

	public void setJornada(Jornada jornada) {
		this.jornada = jornada;
	}

	public Collection getEstadio() {
		return estadio;
	}

	public void setEstadio(Collection estadio) {
		this.estadio = estadio;
	}
	
	
	
	
}
