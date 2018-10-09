package Ordenacion;

import Elementos.*;
import Listas.Listas;
import Listas.Nodo;
import javax.sound.sampled.LineUnavailableException;

public class BubbleSort {
	
	//Burbuja mejorado
	public static void bubbleSortAsc(Object arr) throws InterruptedException, LineUnavailableException {
		boolean swapped = true;
		int j = 0;
		Object tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < ((Listas)arr).lenght() - j; i++) {
				if (((Comparadores) ((Elemento)((Nodo)((Listas) arr).buscarNodo(i)).getDato()).getDato()).mayorQue(((Elemento)((Nodo)((Listas) arr).buscarNodo(i+1)).getDato()).getDato())) {
					Thread.sleep(10);
                                        Sound.tono(i*500,10);
					tmp = ((Nodo)((Listas)arr).buscarNodo(i)).getDato();
					((Nodo) ((Listas)arr).buscarNodo(i)).setDato(((Nodo)(((Listas) arr).buscarNodo(i+1))).getDato());
					((Nodo) ((Listas)arr).buscarNodo(i+1)).setDato(tmp);
					swapped = true;
				}
			}
		}
	}
	
	public static void bubbleSortDesc(Object arr) throws InterruptedException {
		boolean swapped = true;
		int j = 0;
		Object tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < ((Listas)arr).lenght() - j; i++) {
				if (((Comparadores) ((Elemento)((Nodo)((Listas) arr).buscarNodo(i)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) arr).buscarNodo(i+1)).getDato()).getDato())) {
					Thread.sleep(10);
					tmp = ((Nodo)((Listas)arr).buscarNodo(i)).getDato();
					((Nodo) ((Listas)arr).buscarNodo(i)).setDato(((Nodo)(((Listas) arr).buscarNodo(i+1))).getDato());
					((Nodo) ((Listas)arr).buscarNodo(i+1)).setDato(tmp);
					swapped = true;
				}
			}
		}
	}
}