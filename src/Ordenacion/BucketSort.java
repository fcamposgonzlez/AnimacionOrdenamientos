package Ordenacion;

import java.util.ArrayList;
import java.util.List;
import Elementos.*;
import Listas.*;
import javax.sound.sampled.LineUnavailableException;
public class BucketSort {
    private static final int DEFAULT_BUCKET_SIZE = 8;

    public static void sort(Listas array) throws InterruptedException, LineUnavailableException {
        array = sort(array, DEFAULT_BUCKET_SIZE);
    }

    public static Listas sort(Listas array, int bucketSize) throws InterruptedException, LineUnavailableException {
        if (array.lenght() == 0) {
            return null;
        }
        Entero minValue = (Entero) ((Nodo) array.buscarNodo(0)).getDato().getDato();
        Entero maxValue = (Entero) ((Nodo) array.buscarNodo(0)).getDato().getDato();
        for (int i = 1; i < array.lenght(); i++) {
        	Thread.sleep(10);
            if (((Entero)((Nodo) array.buscarNodo(i)).getDato().getDato()).menorQue(minValue)) {
                minValue = (Entero) ((Nodo) array.buscarNodo(i)).getDato().getDato();
            } else if (((Entero)((Nodo) array.buscarNodo(i)).getDato().getDato()).mayorQue(maxValue)) {
                maxValue = (Entero) ((Nodo) array.buscarNodo(i)).getDato().getDato();
            }
        }

        int bucketCount = (maxValue.getNumero() - minValue.getNumero()) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
        	Thread.sleep(10);
                Sound.tono(i*500,10);
            buckets.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < array.lenght(); i++) {
        	Thread.sleep(10);
                Sound.tono(i*500,10);
            buckets.get((((Entero) ((Nodo) array.buscarNodo(i)).getDato().getDato()).getNumero() - minValue.getNumero()) / bucketSize).add(((Entero) ((Nodo) array.buscarNodo(i)).getDato().getDato()).getNumero());
        }
        int c = array.lenght();
        for (int y = 0; y<c;y++){
        	Thread.sleep(10);
                Sound.tono(y*500,10);
        	array.eliminarCabeza();
        }
        for (int i = 0; i < buckets.size(); i++) {
        	Thread.sleep(10);
                Sound.tono(i*500,10);
            Listas bucketArray = new Lista();
            for(int x = 0; x < buckets.get(i).size();x++){
            	bucketArray = (Listas) bucketArray.insertarEnCola(new Elemento((int)buckets.get(i).get(x)));
            	Thread.sleep(10);
                Sound.tono(x*500,10);
            }
            Insercion.ordInsercionAsc(bucketArray);
            for (int j = 0; j < bucketArray.lenght(); j++) {
            	Thread.sleep(10);
                Sound.tono(j*500,10);
                array.insertarEnCola((((Nodo)bucketArray.buscarNodo(j)).getDato()));
            }
        }
		return array;
    }

}