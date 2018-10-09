package app;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Elementos.*;
import Listas.*;
import processing.core.PApplet;


public class Animacion extends PApplet {

	public static Object lista;

        public static void main(String[] args) {
		PApplet.main("Animacion");
	}

	public Object getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		Animacion.lista = lista;
	}

        @Override
	public void settings() {
		size(850, 640);
	}

        @Override
	public void setup() {
		background(255, 255, 255);
		frameRate(30);
	}

        @Override
	public void draw() {
		background(255, 255, 255);
		if (lista instanceof Listas) {
			if (((Elemento)((Nodo) ((Listas) lista).buscarNodo(0)).getDato()).getDato() instanceof Entero) {
				for (int i = 0; i < ((Listas) lista).lenght(); i++) {
					Object n = ((Elemento) (((Nodo) ((Listas) lista).buscarNodo(i)).getDato())).getDato();
					if ((i * 15) < this.width) {
						rect(i * 15, (this.height / 2), 10, -((Entero) n).getNumero());
					} else {
						rect((((Listas) lista).lenght() - (i)) * 15, (this.height - 20), 10, -((Entero) n).getNumero());
					}
				}
			} else if (((Elemento)((Nodo) ((Listas) lista).buscarNodo(0)).getDato()).getDato() instanceof Doble) {
				for (int i = 0; i < ((Listas) lista).lenght(); i++) {
					Object n = ((Elemento) (((Nodo) ((Listas) lista).buscarNodo(i)).getDato())).getDato();
					if ((i * 15) < this.width) {
						rect(i * 15, (this.height / 2), 10, (float) -(((Doble) n).getDato())/2);
					} else {
						rect((((Listas) lista).lenght() - (i)) * 15, (this.height - 20), 10,(float) -(((Doble) n).getDato())/2);
					}
				}
			}
                        
		}
	}
}