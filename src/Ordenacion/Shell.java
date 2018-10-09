package Ordenacion;

import Ordenacion.Intercambiar;
import Elementos.Comparadores;
import Elementos.Elemento;
import Listas.*;
import javax.sound.sampled.LineUnavailableException;
public class Shell {

	public static void ordenacionShellAsc(Object a) throws InterruptedException, LineUnavailableException {
		int intervalo, i, j, k;
		int n = ((Listas) a).lenght();
		intervalo = n / 2;
		while (intervalo > 0) {
			for (i = intervalo; i < n; i++) {
                            Thread.sleep(10);
				j = i - intervalo;
				while (j >= 0) {
					k = j + intervalo;
					if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()).menorIgualQ(((Elemento)((Nodo)((Listas) a).buscarNodo(k)).getDato()).getDato()))
						j = -1; // par de elementos ordenado
					else {
						Intercambiar.intercambiar(a, j, j + 1);
						j -= intervalo;
					}
				}
			}
			intervalo = intervalo / 2;
		}
	}
	
	public static void ordenacionShellDesc(Object a) throws InterruptedException, LineUnavailableException {
		int intervalo, i, j, k;
		int n = ((Listas) a).lenght();
		intervalo = n / 2;
		while (intervalo > 0) {
			for (i = intervalo; i < n; i++) {
				j = i - intervalo;
				while (j >= 0) {
					k = j + intervalo;
					if (((Comparadores) ((Elemento)((Nodo)((Listas) a).buscarNodo(j)).getDato()).getDato()).mayorIgualQ(((Elemento)((Nodo)((Listas) a).buscarNodo(k)).getDato()).getDato()))
						j = -1; // par de elementos ordenado
					else {
						Intercambiar.intercambiar(a, j, j + 1);
						j -= intervalo;
					}
				}
			}
			intervalo = intervalo / 2;
		}
	}
}