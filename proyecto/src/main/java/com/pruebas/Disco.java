package com.pruebas;

public class Disco {
	private String titulo;
	private String grupo;
	
	public Disco() {
		System.out.println("Disco construido");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Disco: " + titulo + ", grupo: " + grupo;
	}

	
}
