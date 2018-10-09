package Ordenacion;

import Ordenacion.Intercambiar;
import Listas.*;
import Elementos.*;
import javax.sound.sampled.LineUnavailableException;
public class Seleccion {

	public static void ordSeleccionAsc(Object a) throws InterruptedException, LineUnavailableException {
		int indiceMenor, i, j, n;
		n = ((Listas)a).lenght();
                
		for (i = 0; i < n - 1; i++) {
			// comienzo de la exploración en índice i
			indiceMenor = i;
			// j explora la sublista a[i+1]..a[n-1]
			for (j = i + 1; j < n; j++)
				if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(indiceMenor)).getDato()).getDato())) 	
					indiceMenor = j;
			// sit�a el elemento mas pequeño en a[i]
			if (i != indiceMenor){
                            Thread.sleep(10);
                            Intercambiar.intercambiar(a, i, indiceMenor);
                        }
		}
	}
	
	public static void ordSeleccionDesc(Object a) throws InterruptedException, LineUnavailableException {
		int indiceMenor, i, j, n;
		n = ((Listas)a).lenght();

		for (i = 0; i < n - 1; i++) {
			// comienzo de la exploración en índice i
			indiceMenor = i;
			// j explora la sublista a[i+1]..a[n-1]
			for (j = i + 1; j < n; j++)
				//if (((Comparadores) ((Elemento) ((Listas) ((Listas)a).buscarNodo(j)).getDato()).getElemento()).menorQue(((Elemento) ((Listas) ((Listas) a).buscarNodo(indiceMenor)).getDato()).getElemento()))
				if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()).mayorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(indiceMenor)).getDato()).getDato())) 	
					indiceMenor = j;
			// sitúa el elemento mas pequeño en a[i]
			if (i != indiceMenor)
				Intercambiar.intercambiar(a, i, indiceMenor);
		}
	}
	

}