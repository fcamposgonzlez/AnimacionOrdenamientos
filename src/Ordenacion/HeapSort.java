package Ordenacion;

import Listas.*;
import Elementos.*;
import javax.sound.sampled.LineUnavailableException;

public class HeapSort {
    private static Listas a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    
    public static void buildheap(Listas a) throws InterruptedException{
        n=a.lenght()-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
        }
    }
    
    public static void maxheap(Listas a, int i) throws InterruptedException{ 
        left=2*i;
        right=2*i+1;
        if(left <= n && ((Comparadores)((Nodo) a.buscarNodo(left)).getDato().getDato()).mayorQue(((Nodo) a.buscarNodo(i)).getDato().getDato())){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && ((Comparadores)((Nodo) a.buscarNodo(right)).getDato().getDato()).mayorQue(((Nodo) a.buscarNodo(largest)).getDato().getDato())){
            largest=right;
        }
        if(largest!=i){
        	Thread.sleep(10);
            exchange(i,largest);
            Thread.sleep(10);
            maxheap(a, largest);
        }
    }
    
    public static void exchange(int i, int j){
        Elemento t=((Nodo) a.buscarNodo(i)).getDato();
        ((Nodo) a.buscarNodo(i)).setDato(((Nodo) a.buscarNodo(j)).getDato());
        ((Nodo) a.buscarNodo(j)).setDato(t);
        }
    
    public static void heapSort(Listas a0) throws InterruptedException, LineUnavailableException{
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
            Thread.sleep(10);
            Sound.tono(i*500,10);
        }
    }
}

