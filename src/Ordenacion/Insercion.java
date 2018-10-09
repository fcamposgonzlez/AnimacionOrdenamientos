package Ordenacion;

import Listas.*;
import Elementos.*;
import javax.sound.sampled.LineUnavailableException;

public class Insercion{

	public static void ordInsercionAsc(Object a) throws InterruptedException, LineUnavailableException {
		int i, j;
		Object aux;
		for (i = 1; i <  ((Listas) a).lenght(); i++) {
			j = i;
			aux = ((Nodo)((Listas) a).buscarNodo(i)).getDato();
			// se localiza el punto de inserción explorando hacia abajo
			while (j > 0 && (((Comparadores)((Elemento)aux).getDato()).menorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(j-1)).getDato()).getDato()))){
				((Nodo) ((Listas)a).buscarNodo(j)).setDato(((Nodo)(((Listas) a).buscarNodo(j-1))).getDato());
				j--;
			}
			Thread.sleep(10);
                        Sound.tono(i*500,10);
			((Nodo) ((Listas)a).buscarNodo(j)).setDato(aux);
		}
	}
	
	public static void ordInsercionDesc(Object a) throws InterruptedException, LineUnavailableException {
		int i, j;
		Object aux;
		for (i = 1; i <  ((Listas) a).lenght(); i++) {
			/*
			 * indice j es para explorar la sublista a[i-1]..a[0] buscando la
			 * posicion correcta del elemento destino
			 */
			j = i;
			aux = ((Nodo)((Listas) a).buscarNodo(i)).getDato();
			// se localiza el punto de inserción explorando hacia abajo
			while (j > 0 && (((Comparadores)((Elemento)aux).getDato()).mayorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(j-1)).getDato()).getDato()))){
				((Nodo) ((Listas)a).buscarNodo(j)).setDato(((Nodo)(((Listas) a).buscarNodo(j-1))).getDato());
				j--;
			}
                        Sound.tono(i*500,10);
			Thread.sleep(10);
			((Nodo) ((Listas)a).buscarNodo(j)).setDato(aux);
		}
	}
}