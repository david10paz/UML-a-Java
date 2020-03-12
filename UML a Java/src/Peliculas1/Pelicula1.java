package Peliculas1;

import java.net.URI;
import java.sql.Time;
import java.util.Date;

public class Pelicula1 {

	public class Pelicula{
		
		private String titulo;
		private Date agno;
		private String sinopsis;
		private Genero genero;
		private String pais;
		
		public java.util.Collection actor = new java.util.TreeSet();
		public java.util.Collection director = new java.util.TreeSet();
		public java.util.Collection productor = new java.util.TreeSet();
		public java.util.Collection guionista = new java.util.TreeSet();
		
		
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

		public java.util.Collection getActor() {
			return actor;
		}

		public void setActor(java.util.Collection actor) {
			this.actor = actor;
		}

		public java.util.Collection getDirector() {
			return director;
		}

		public void setDirector(java.util.Collection director) {
			this.director = director;
		}

		public java.util.Collection getProductor() {
			return productor;
		}

		public void setProductor(java.util.Collection productor) {
			this.productor = productor;
		}

		public java.util.Collection getGuionista() {
			return guionista;
		}

		public void setGuionista(java.util.Collection guionista) {
			this.guionista = guionista;
		}
		
		//////////////////////////////////////

		public Trailer trailer;
		
		public Pelicula() {
			trailer = new Trailer();
		}

		public Trailer getTrailer() {
			return trailer;
		}

		public void setTrailer(Trailer trailer) {
			this.trailer = trailer;
		}
		
		////////////////////////////////////////////////////////////////////////
		
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
		
	}
	
	////////////////////////////////////////////////////////////////////
	
	public class Trailer{
		
		private URI Url;
		private Time duracion;
		
		public java.util.Collection editor = new java.util.TreeSet();
		

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

		public java.util.Collection getEditor() {
			return editor;
		}

		public void setEditor(java.util.Collection editor) {
			this.editor = editor;
		}
		
		////////////////////////////////////////////////////////////////////////
		
	}
	
	public enum Genero{
		
		DRAMA, COMEDIA, ACCIÓN, TERROR, ROMANCE, AVENTURA, CIENCIAFICCION
		
	}
}
