package Biblioteca;

import java.io.Serializable;

public class Libro implements Serializable{
	
	protected String autor;
	protected String titulo;
	protected int anhoPublicacion;
	protected String editorial;
	protected String isbn;
	
	Libro(){}
	
	
	public Libro( String titulo, String autor, int anhoPublicacion, String editorial, String isbn) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.anhoPublicacion = anhoPublicacion;
		this.editorial = editorial;
		this.isbn = isbn;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String genero) {
		this.titulo = genero;
	}


	public int getAnhoPublicacion() {
		return anhoPublicacion;
	}


	public void setAnhoPublicacion(int anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", genero=" + titulo + ", anhoPublicacion=" + anhoPublicacion + ", editorial="
				+ editorial + ", isbn=" + isbn + "]";
	}
	
	
	
	
	
	

}
