package Rugby;

import java.sql.Date;
import Rugby.Rugby.Partido.Estadio.Equipo;

public class Rugby {

	public class Torneo{
		
		private Date año; 
		public Equipo equipo;
		public Jornada jornada; 
		
		public Date getAño() {
			return año;
		}

		public void setAño(Date año) {
			this.año = año;
		}

		public Equipo getEquipo() {
			return equipo;
		}

		public void setEquipo(Equipo equipo) {
			this.equipo = equipo;
		}

		public Jornada getJornada() {
			return jornada;
		}

		public void setJornada(Jornada jornada) {
			this.jornada = jornada;
		}

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
		
		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public Partido getPartido() {
			return partido;
		}

		public void setPartido(Partido partido) {
			this.partido = partido;
		}
		

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


		public Equipo getLocal() {
			return local;
		}


		public void setLocal(Equipo local) {
			this.local = local;
		}


		public Equipo getVisitante() {
			return visitante;
		}


		public void setVisitante(Equipo visitante) {
			this.visitante = visitante;
		}


		public Arbitro getArbitra() {
			return arbitra;
		}


		public void setArbitra(Arbitro arbitra) {
			this.arbitra = arbitra;
		}

		

		public void resultado() {
			System.out.println("Resultado: Equipo 1 -->" + (puntosLocal + bonusLocal) + " / Equipo 2 ---> " + (puntosVisitantes + bonusVisitante));
		}
		
		public class Arbitro extends Persona{
			
		}
		
		
		public class Estadio{
			
			private String nombre;
			private int capacidad;
			private String ciudad;
			
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


			
			public class Equipo{
				
				private Pais nombre;
				public Entrenador entrena;
				public Jugador jugadores;
				
				public Pais getNombre() {
					return nombre;
				}

				public void setNombre(Pais nombre) {
					this.nombre = nombre;
				}

				public Entrenador getEntrena() {
					return entrena;
				}

				public void setEntrena(Entrenador entrena) {
					this.entrena = entrena;
				}

				public Jugador getJugadores() {
					return jugadores;
				}

				public void setJugadores(Jugador jugadores) {
					this.jugadores = jugadores;
				}

				public class Entrenador extends Persona{
					
				}
				
				public class Jugador extends Persona{
					private Posicion posicion;
					public java.util.Collection capitan = new java.util.TreeSet();
					
					
					public Posicion getPosicion() {
						return posicion;
					}
					public void setPosicion(Posicion posicion) {
						this.posicion = posicion;
					}
					public java.util.Collection getCapitan() {
						return capitan;
					}
					public void setCapitan(java.util.Collection capitan) {
						this.capitan = capitan;
					}
					
					
				}
			}
		}
	}
	
	public class Persona{
		
		private String nombre;
		private Date fechaNacimiento;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
	}
	
	
	
	public enum Pais{
		
		ESCOCIA, FRANCIA, GALES, INGLATERRA, IRLANDA, ITALIA
		
	}
	
	public enum Posicion{
		
		PILIER, TALONADOR, SEGUNDALINEA, TERCERALINEA, MEDIOMELÉ, APERTURA, CENRO, ALA, ZAGUERO
		
	}
}
