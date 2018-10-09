package Listas;

import Elementos.Elemento;

public class Nodo{

	public Elemento dato;
	public Nodo enlace;
	public Nodo enlaceAnte;


	public Nodo(Elemento d) {
		dato = d;
		enlace = null;
	}

	public Nodo(Elemento d, Nodo n) {
		dato = d;
		enlace = n;
	}

	public Nodo() {
		dato = new Elemento();
		enlace = null;
	}

	public Elemento getDato() {
		return dato;
	}

	public void setDato(Object  dato) {
		this.dato = (Elemento) dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
	public Nodo getEnlaceAnte() {
		return enlaceAnte;
	}

	public void setEnlaceAnte(Nodo enlaceAnte) {
		this.enlaceAnte = enlaceAnte;
	}
}
	