package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;

public class Entrenador extends Persona{

	private Collection entrena = new ArrayList<Equipo>();

	//getters and setters
	
	public Collection getEntrena() {
		return entrena;
	}

	public void setEntrena(Collection entrena) {
		this.entrena = entrena;
	}
	
	
}
