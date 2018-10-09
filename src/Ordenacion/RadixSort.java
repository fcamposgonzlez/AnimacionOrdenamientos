package Ordenacion;

import Listas.*;
import Elementos.*;
import javax.sound.sampled.LineUnavailableException;

public class RadixSort {
	public static void rSort(Listas a) throws InterruptedException, LineUnavailableException {
            int i, m = ((Entero)((Nodo)a.buscarNodo(0)).getDato().getDato()).getNumero(), exp = 1, n = a.lenght();
	     int[] b = new int[10];
	        for (i = 1; i < n; i++)
	            if (((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero() > m)
	                m = ((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero();
	        while (m / exp > 0)
	        {
	            int[] bucket = new int[10];
	            for (i = 0; i < n; i++)
	                bucket[(((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero() / exp) % 10]++;
	            for (i = 1; i < 10; i++)
	                bucket[i] += bucket[i - 1];
	            for (i = n - 1; i >= 0; i--)
	                b[--bucket[(((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero() / exp) % 10]] = ((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero();
	            for (i = 0; i < n; i++)
                        Sound.tono(i*500,10);
	            	Thread.sleep(10);
	            	((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).setNumero(b[i]);
	            exp *= 10;  
	        }
	    }
}
