package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {

	private Date a�o;
	
	private Collection jornadas;
	
	public void ganador(){
		
		System.out.println("El ganador es" + Equipo.Pais.class);
		
	}
	public void clasificacion(){
		
	}

    public Torneo() {

        jornadas = new ArrayList<Jornada>();

    }
    
    //getters and setters
    
	public Date getA�o() {
		return a�o;
	}
	public void setA�o(Date a�o) {
		this.a�o = a�o;
	}
	public Collection getJornadas() {
		return jornadas;
	}
	public void setJornadas(Collection jornadas) {
		this.jornadas = jornadas;
	}
    
    
    
    
	
}
