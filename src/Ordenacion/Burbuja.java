package Ordenacion;

import Elementos.Comparadores;
import Elementos.Elemento;
import Listas.Listas;
import Listas.Nodo;
import javax.sound.sampled.LineUnavailableException;

public class Burbuja {

	public static void burbujaDesc( Object arr) throws InterruptedException, LineUnavailableException {
		Object tmp;
		 for (int i = 0; i < ((Listas)arr).lenght()-1; i++) {
		     for (int j = 0; j < ((Listas)arr).lenght()-i-1; j++) {
		    	 if (((Comparadores) ((Elemento)((Nodo)((Listas) arr).buscarNodo(j+1)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) arr).buscarNodo(j)).getDato()).getDato())) {
		    		 	Thread.sleep(10);
                                        Sound.tono(j*500,10);
		    		 	tmp = ((Nodo)((Listas)arr).buscarNodo(j+1)).getDato();
						((Nodo) ((Listas)arr).buscarNodo(j+1)).setDato(((Nodo)(((Listas) arr).buscarNodo(j))).getDato());
						((Nodo) ((Listas)arr).buscarNodo(j)).setDato(tmp);
		  		}
		     }
		 }
	}
	
	public static void burbujaAsc( Object arr) throws InterruptedException {
		Object tmp;
		 for (int i = 0; i < ((Listas)arr).lenght(); i++) {
		     for (int j = 0; j < ((Listas)arr).lenght() - 1; j++) {
		    	 if (((Comparadores) ((Elemento)((Nodo)((Listas) arr).buscarNodo(i)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) arr).buscarNodo(i+1)).getDato()).getDato())) {
		    		 	Thread.sleep(10);
		    		 	tmp = ((Nodo)((Listas)arr).buscarNodo(i)).getDato();
						((Nodo) ((Listas)arr).buscarNodo(i)).setDato(((Nodo)(((Listas) arr).buscarNodo(i+1))).getDato());
						((Nodo) ((Listas)arr).buscarNodo(i+1)).setDato(tmp);
		  		}
		     }
		 }
	}
}
