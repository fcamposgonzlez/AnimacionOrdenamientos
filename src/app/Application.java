package app;
import java.util.Random;

import Elementos.Elemento;
import Listas.*;
import Ordenacion.BubbleSort;
import static Ordenacion.BubbleSort.bubbleSortAsc;
import static Ordenacion.BucketSort.sort;
import static Ordenacion.Burbuja.burbujaAsc;
import static Ordenacion.Burbuja.burbujaDesc;
import static Ordenacion.CountingSort.countingSort;
import static Ordenacion.HeapSort.heapSort;
import static Ordenacion.Insercion.ordInsercionAsc;
import static Ordenacion.Intercambio.ordenacionIntercambioAsc;
import static Ordenacion.MergeSort.mergeSort;
import static Ordenacion.QuickSort.quicksortAsc;
import static Ordenacion.RadixSort.rSort;
import static Ordenacion.Seleccion.ordSeleccionAsc;
import static Ordenacion.Shell.ordenacionShellAsc;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.sound.sampled.LineUnavailableException;
import processing.core.PApplet;

public class Application {
    public Listas lista;
    public void crearLista(String pTipoLista,ArrayList<String> pValores,boolean pTipo) throws InterruptedException{
        switch (pTipoLista) {
            case "Simples":
                this.lista = new Lista();
                if(!pTipo){
                    for(int i=0;i<pValores.size();i++){
                	this.lista.insertarEnCola(new Elemento(Integer.parseInt(pValores.get(i))));
                        Thread.sleep(10);
                    }
                }else{
                    for(int i=0;i<pValores.size();i++){
                	this.lista.insertarEnCola(new Elemento(Double.parseDouble(pValores.get(i))));
                        Thread.sleep(10);
                    }
                }  
                System.out.println(pTipoLista);
                break;
                
            case "Dobles":
            	this.lista = new ListaDob();
                if(!pTipo){
                    for(int i=0;i<pValores.size();i++){
                	this.lista.insertarEnCola(new Elemento(Integer.parseInt(pValores.get(i))));
                        Thread.sleep(10);
                    }
                }else{
                    for(int i=0;i<pValores.size();i++){
                	this.lista.insertarEnCola(new Elemento(Double.parseDouble(pValores.get(i))));
                        Thread.sleep(10);
                    }
                } 
                System.out.println(pTipoLista);
                break;
            case "Dobles Circulares":
            	this.lista = new ListaDobCir();
                if(!pTipo){
                    for(int i=0;i<pValores.size();i++){
                	this.lista.insertarEnCola(new Elemento(Integer.parseInt(pValores.get(i))));
                        Thread.sleep(10);
                    }
                }else{
                    for(int i=0;i<pValores.size();i++){
                	this.lista.insertarEnCola(new Elemento(Double.parseDouble(pValores.get(i))));
                        Thread.sleep(10);
                    }
                } 
                System.out.println(pTipoLista);
                break;
        }
    }
    public void Ordenar(String pMetodoOrdenamiento,Listas lista) throws InterruptedException, LineUnavailableException{
        switch (pMetodoOrdenamiento) {
            case "Intercambio":
                ordenacionIntercambioAsc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Seleccion":
                ordSeleccionAsc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Insercion":
                ordInsercionAsc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Burbuja":
                burbujaDesc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Burbuja mejorado":
                bubbleSortAsc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Shell":
                ordenacionShellAsc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Mergesort":
                mergeSort(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Quicksort":
                quicksortAsc(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Radixsort":
                rSort(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Bucketsort":
                sort(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Counting Sort":
                countingSort(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
            case "Heapsort":
                heapSort(lista);
                System.out.println(pMetodoOrdenamiento);
                break;
        }
    }
    
    public Application(String pTipoLista,ArrayList<String> pValores, String pMetodoOrdenamiento, boolean pTipo) throws InterruptedException, LineUnavailableException {
        init(pTipoLista,pValores,pMetodoOrdenamiento,pTipo);
    }

    private void init(String pTipoLista,ArrayList<String> pValores, String pMetodoOrdenamiento,boolean pTipo) throws InterruptedException, LineUnavailableException {
        crearLista(pTipoLista,pValores,pTipo);
        PApplet.main("app.Animacion");
        Animacion.lista = this.lista;
        Thread.sleep(100);
        Ordenar(pMetodoOrdenamiento, (Listas) this.lista);
        Thread.sleep(100);
    }

}