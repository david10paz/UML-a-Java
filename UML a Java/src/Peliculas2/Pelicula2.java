package Peliculas2;

import java.net.URI;
import java.sql.Time;
import java.util.Date;

public class Pelicula2 {

	public class Pelicula{
		
		private String titulo;
		private Date agno;
		private String sinopsis;
		private Genero genero;
		private String pais;
		

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public Date getAgno() {
			return agno;
		}

		public void setAgno(Date agno) {
			this.agno = agno;
		}

		public String getSinopsis() {
			return sinopsis;
		}

		public void setSinopsis(String sinopsis) {
			this.sinopsis = sinopsis;
		}

		public Genero getGenero() {
			return genero;
		}

		public void setGenero(Genero genero) {
			this.genero = genero;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}
		
		//////////////////////////////////////

		public Trailer trailer;
		public Guionista guionista;
		public Director director;
		public Actor actor;
		public Productor productor;
		

		public Trailer getTrailer() {
			return trailer;
		}

		public void setTrailer(Trailer trailer) {
			this.trailer = trailer;
		}

		public Guionista getGuionista() {
			return guionista;
		}

		public void setGuionista(Guionista guionista) {
			this.guionista = guionista;
		}

		public Director getDirector() {
			return director;
		}

		public void setDirector(Director director) {
			this.director = director;
		}

		public Actor getActor() {
			return actor;
		}

		public void setActor(Actor actor) {
			this.actor = actor;
		}

		public Productor getProductor() {
			return productor;
		}

		public void setProductor(Productor productor) {
			this.productor = productor;
		}
		
		///////////////////////////////////////////////////////

		public Pelicula() {
			trailer = new Trailer();
			guionista = new Guionista();
			director = new Director();
			actor = new Actor();
			productor = new Productor();
			
		}
		
		///////////////////////////////////////////////////////////////////////
		
	}
	
	public class Persona{
		
		private String nombre;
		private String apellidos;
		private Date fechaNacimiento;
		private String nacionalidad;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getNacionalidad() {
			return nacionalidad;
		}
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
		
		///////////////////////////////////////////////////////////////////////
		
	}
	
	public class Guionista extends Persona{
		
	}
	
	public class Director extends Persona{
		
	}
	
	public class Actor extends Persona{
		
	}
	
	public class Productor extends Persona{
		
	}
	
	public class Editor extends Persona{
		
	}
	
	public class Trailer{
		
		private URI Url;
		private Time duracion;
		
		
		public URI getUrl() {
			return Url;
		}

		public void setUrl(URI url) {
			Url = url;
		}

		public Time getDuracion() {
			return duracion;
		}

		public void setDuracion(Time duracion) {
			this.duracion = duracion;
		}
		
		/////////////////////////////////////////////////////

		public Editor editor;
		
		public Trailer() {
			
			editor = new Editor();
		}
		

		public Editor getEditor() {
			return editor;
		}

		public void setEditor(Editor editor) {
			this.editor = editor;
		}
		
	}
	
	public enum Genero{
		
		DRAMA, COMEDIA, ACCIÓN, TERROR, ROMANCE, AVENTURA, CIENCIAFICCION
		
	}
}
