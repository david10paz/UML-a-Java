package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;

public class Jugador {

	public enum Posicion{
		
		PILIER, TALONADOR, SEGUNDALINEA, TERCERALINEA, MEDIOMELÉ, APERTURA, CENRO, ALA, ZAGUERO
		
	}
	
	private Posicion posicion;
	private Collection jugadores = new ArrayList<Equipo>();
	private Collection capitan = new ArrayList<Jugador>();
	
	//getters and setters
	
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public Collection getJugadores() {
		return jugadores;
	}
	public void setJugadores(Collection jugadores) {
		this.jugadores = jugadores;
	}
	public Collection getCapitan() {
		return capitan;
	}
	public void setCapitan(Collection capitan) {
		this.capitan = capitan;
	}
	
	
}
