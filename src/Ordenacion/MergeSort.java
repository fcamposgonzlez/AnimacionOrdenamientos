
package Ordenacion;

import Elementos.Comparadores;
import Elementos.Elemento;
import Listas.*;
import javax.sound.sampled.LineUnavailableException;

public class MergeSort {

	public static void mergeSort(Object a) throws InterruptedException, LineUnavailableException {
		int size = ((Listas) a).lenght();
		if (size < 2)
			return;
		int mid = size / 2;
		// int leftSize = mid;
		// int rightSize = size - mid;
		Lista left = new Lista();
		Lista right = new Lista();
		for (int i = 0; i < mid; i++) {
                    Sound.tono(i*500,10);
                    Thread.sleep(10);
                    left.insertarEnCola(((Nodo) ((Listas) a).buscarNodo(i)).getDato());

		}
		for (int h = mid; h < size; h++) {
                    Sound.tono(h*500,10);
                    Thread.sleep(10);
                    right.insertarEnCola(((Nodo) ((Listas) a).buscarNodo(h)).getDato());
		}
		mergeSort(left);
                
		mergeSort(right);
                
		merge(left, right, a);
	}

	public static void merge(Object left, Object right, Object arr) throws InterruptedException, LineUnavailableException {
		int leftSize = ((Listas) left).lenght();
		int rightSize = ((Listas) right).lenght();
		int i = 0, j = 0, k = 0;
		while (i < leftSize && j < rightSize) {
			if (((Comparadores) ((Elemento) ((Nodo) ((Listas) left).buscarNodo(i)).getDato()).getDato())
					.menorIgualQ(((Elemento) ((Nodo) ((Listas) right).buscarNodo(j)).getDato()).getDato())) {
				// if (left[i] <= right[j]) {
                                Sound.tono(i*500,10);
				Thread.sleep(10);
				((Nodo) ((Listas) arr).buscarNodo(k)).setDato(((Nodo) (((Listas) left).buscarNodo(i))).getDato());
				// arr[k] = left[i];
				i++;
				k++;
			} else {
                                Sound.tono(i*500,10);
				Thread.sleep(10);
				((Nodo) ((Listas) arr).buscarNodo(k)).setDato(((Nodo) (((Listas) right).buscarNodo(j))).getDato());
				// arr[k] = right[j];
				k++;
				j++;
			}
		}
		while (i < leftSize) {
                        Sound.tono(i*500,10);
			Thread.sleep(10);
			((Nodo) ((Listas) arr).buscarNodo(k)).setDato(((Nodo) (((Listas) left).buscarNodo(i))).getDato());
			// arr[k] = left[i];
			i++;
			k++;
		}
		while (j < rightSize) {
                    Sound.tono(j*500,10);
			Thread.sleep(10);
			((Nodo) ((Listas) arr).buscarNodo(k)).setDato(((Nodo) (((Listas) right).buscarNodo(j))).getDato());
			// arr[k] = right[j];
			k++;
			j++;
		}
               Thread.sleep(10); 
	}
}
