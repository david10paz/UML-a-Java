package Rugby;

import java.sql.Date;
import Rugby.Rugby.Partido.Estadio.Equipo;

public class RugbySinGettersSetters {

	public class Torneo{
		
		private Date año; 
		public Equipo equipo;
		public Jornada jornada; 
		
		public void ganador(){
			System.out.println("El ganador es" + equipo);
		}
		
		public void clasificacion() {
			
		}
	
		public Torneo() {
			jornada = new Jornada();
		}
	}
	
	public class Jornada{
		
		private Date fecha;
		public Partido partido;
		
		public Jornada(){
			partido = new Partido();
		}
	}
	
	public class Partido{
		
		private int puntosLocal;
		private int puntosVisitantes;
		private int bonusLocal;
		private int bonusVisitante;
		public Equipo local;
		public Equipo visitante;
		public Arbitro arbitra;
		
		public void resultado() {
			System.out.println("Resultado: Equipo 1 -->" + (puntosLocal + bonusLocal) + " / Equipo 2 ---> " + (puntosVisitantes + bonusVisitante));
		}
		
		public class Arbitro extends Persona{
			
		}
		
		
		public class Estadio{
			
			private String nombre;
			private int capacidad;
			private String ciudad;
			
			
			public class Equipo{
				
				private Pais nombre;
				public Entrenador entrena;
				public Jugador jugadores;
				
				public class Entrenador extends Persona{
					
				}
				
				public class Jugador extends Persona{
					private Posicion posicion;
					public java.util.Collection capitan = new java.util.TreeSet();
				}
			}
		}
	}
	
	public class Persona{
		
		private String nombre;
		private Date fechaNacimiento;
		
	}
	
	
	
	public enum Pais{
		
		ESCOCIA, FRANCIA, GALES, INGLATERRA, IRLANDA, ITALIA
		
	}
	
	public enum Posicion{
		
		PILIER, TALONADOR, SEGUNDALINEA, TERCERALINEA, MEDIOMELÉ, APERTURA, CENRO, ALA, ZAGUERO
		
	}
}
