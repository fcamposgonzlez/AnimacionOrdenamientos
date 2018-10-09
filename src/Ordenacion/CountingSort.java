package Ordenacion;

import Elementos.Elemento;
import Elementos.Entero;
import Listas.*;
import javax.sound.sampled.LineUnavailableException;

public class CountingSort {
	public static int numeMayor(Listas a) throws InterruptedException, LineUnavailableException{
		int NumMayo = -1;
		for(int i = a.lenght()-1; i >= 0; i--){
			Thread.sleep(10);
                        Sound.tono(i*500,10);
			if (NumMayo < ((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero())
				NumMayo = ((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero();
		}	
		return NumMayo;
		
	}
	
	public static void countingSort(Listas a) throws InterruptedException, LineUnavailableException {
		int k = numeMayor(a)+1;
        int c[] = new int[k];
        for (int i = 0; i < a.lenght(); i++)        	
            c[((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero()]++;
        	Thread.sleep(10);
        for (int i = 1; i < k; i++)
            c[i] += c[i-1];
        	Thread.sleep(100);
        int b[] = new int[a.lenght()];
        for (int i = a.lenght()-1; i >= 0; i--)  {         
        	b[--c[((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero()]] = ((Entero)((Nodo)a.buscarNodo(i)).getDato().getDato()).getNumero();
        	Thread.sleep(10);
                Sound.tono(i*500,10);
        }
        for (int i = a.lenght()-1; i >= 0; i--){
        	Thread.sleep(10);
                Sound.tono(i*500,10);
        	a.eliminarCola();
        }
        for (int i = b.length -1; i >= 0; i--){        	
        	a.insertarEnCola(new Elemento(b[i]));
        	Thread.sleep(10);
                Sound.tono(i*500,10);
        }
    }
}
