package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {

	private Date año;
	
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
    
	public Date getAño() {
		return año;
	}
	public void setAño(Date año) {
		this.año = año;
	}
	public Collection getJornadas() {
		return jornadas;
	}
	public void setJornadas(Collection jornadas) {
		this.jornadas = jornadas;
	}
    
    
    
    
	
}
