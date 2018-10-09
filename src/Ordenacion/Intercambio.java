package Ordenacion;

import Ordenacion.Intercambiar;
import Listas.*;
import Elementos.*;
import javax.sound.sampled.LineUnavailableException;
public class Intercambio {
	
	public static void ordenacionIntercambioAsc(Object a) throws InterruptedException, LineUnavailableException {
		int i;
		int j;
		for (i = 0; i < ((Listas) a).lenght() - 1; i++){
                    Thread.sleep(10);
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < ((Listas)a).lenght(); j++)
				if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(i)).getDato()).getDato()).mayorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()))
					Intercambiar.intercambiar((Listas)a, i, j);
                }
                Thread.sleep(10);
	}
	
	public static void ordenacionIntercambioDesc(Object a) throws InterruptedException, LineUnavailableException {
		int i;
		int j;
		for (i = 0; i < ((Listas) a).lenght() - 1; i++)
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < ((Listas)a).lenght(); j++)
				if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(i)).getDato()).getDato()).menorQue(((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()))
					Intercambiar.intercambiar((Listas)a, i, j);
	}
}