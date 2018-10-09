package Ordenacion;

import Ordenacion.Intercambiar;
import Listas.*;
import Elementos.*;
import javax.sound.sampled.LineUnavailableException;

public class QuickSort{

	public static void quicksortAsc(Object a) throws InterruptedException, LineUnavailableException {
		quicksortAsc(a, 0, ((Listas) a).lenght() - 1);
	}

	private static void quicksortAsc(Object a, int primero, int ultimo) throws InterruptedException, LineUnavailableException {
		int i, j, central;
		Object pivote;
		central = (primero + ultimo) / 2;
		pivote = ((Elemento)((Nodo)((Listas) a).buscarNodo(central)).getDato()).getDato();
		i = primero;
		j = ultimo;
		do {
			//if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(i)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(indiceMenor)).getDato()).getDato()))
			while (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(i)).getDato()).getDato()).menorQue(pivote))
				i++;
			while (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()).mayorQue(pivote))
				j--;
			if (i <= j) {
				Intercambiar.intercambiar(a, i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j){
                    Sound.tono(i*500,10);
                    Sound.tono(j*500,10);
                    Thread.sleep(10);
                    quicksortAsc(a, primero, j);
                }// mismo proceso con sublista izqda
		if (i < ultimo){
                    Sound.tono(i*500,100);
                    Sound.tono(j*500,100);
                    Thread.sleep(100);
                    quicksortAsc(a, i, ultimo);
                }// mismo proceso con sublista drcha
	}
	

	public static void quicksortDesc(Object a) throws InterruptedException, LineUnavailableException {
		quicksortDesc(a, 0, ((Listas) a).lenght() - 1);
	}
	
	private static void quicksortDesc(Object a, int primero, int ultimo) throws InterruptedException, LineUnavailableException {
		int i, j, central;
		Object pivote;
		central = (primero + ultimo) / 2;
		pivote = ((Elemento)((Nodo)((Listas) a).buscarNodo(central)).getDato()).getDato();
		i = primero;
		j = ultimo;
		do {
			//if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(i)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(indiceMenor)).getDato()).getDato()))
			while (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(i)).getDato()).getDato()).mayorQue(pivote))
				i++;
			while (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()).menorQue(pivote))
				j--;
			if (i <= j) {
				Intercambiar.intercambiar(a, i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j)
			quicksortDesc(a, primero, j); // mismo proceso con sublista izqda
		if (i < ultimo)
			quicksortDesc(a, i, ultimo); // mismo proceso con sublista drcha
	}
}
