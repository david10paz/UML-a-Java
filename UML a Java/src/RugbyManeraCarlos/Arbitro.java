package RugbyManeraCarlos;

import java.util.ArrayList;
import java.util.Collection;

public class Arbitro extends Persona{

	private Collection arbitra = new ArrayList<Partido>();

	//getters and setters
	
	public Collection getArbitra() {
		return arbitra;
	}

	public void setArbitra(Collection arbitra) {
		this.arbitra = arbitra;
	}
	
	
}
