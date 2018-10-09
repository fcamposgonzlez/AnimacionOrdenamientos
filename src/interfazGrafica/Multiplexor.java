/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import Elementos.Elemento;
import Listas.Lista;
import Listas.ListaCir;
import Listas.ListaDob;
import Listas.ListaDobCir;
import Listas.Listas;
import static Ordenacion.BubbleSort.bubbleSortAsc;
import static Ordenacion.BucketSort.sort;
import static Ordenacion.Burbuja.burbujaAsc;
import static Ordenacion.Burbuja.burbujaDesc;
import static Ordenacion.CountingSort.countingSort;
import static Ordenacion.HeapSort.heapSort;
import static Ordenacion.Insercion.ordInsercionAsc;
import static Ordenacion.Intercambio.ordenacionIntercambioAsc;
import static Ordenacion.MergeSort.mergeSort;
import static Ordenacion.RadixSort.rSort;
import static Ordenacion.QuickSort.quicksortAsc;
import static Ordenacion.Seleccion.ordSeleccionAsc;
import static Ordenacion.Shell.ordenacionShellAsc;
import java.util.ArrayList;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author marco
 */
public class Multiplexor {
Multiplexor multiplexor = new Multiplexor();
private boolean soloInt;
private String tipo;
private String metodo;
    
    public void setSoloInt(boolean condicion){
        this.soloInt = condicion;
    }
    
    public boolean getSoloInt(){
        return soloInt;
    }
    
    public void setTipo(String pTipo){
        this.tipo = pTipo;
    }
    
    public String getTipo(){
        return tipo;
    }
     public void setMetodo(String pMetodo){
        this.tipo = pMetodo;
    }
    
    public String getMetodo(){
        return tipo;
    }
    
    public void tipoLista(String pTipoLista,ArrayList<String> pValores){
        switch (pTipoLista) {
            case "Simples":
                Lista lista = new Lista();
                for(int i=0;i<pValores.size();i++){
                    lista.insertarEnCola(new Elemento(pValores.get(i))); 
                }
                break;
            case "Dobles":
                ListaDob listaDoble = new ListaDob();
                for(int i=0;i<pValores.size();i++){
                    listaDoble.insertarEnCola(new Elemento(pValores.get(i))); 
                }
                break;
            case "Simples Circulares":
                ListaCir listaCircular = new ListaCir();
                for(int i=0;i<pValores.size();i++){
                    listaCircular.insertarEnCola(new Elemento(pValores.get(i))); 
                }
                break;
            case "Dobles Circulares":
                ListaDobCir listaDobleCircular = new ListaDobCir();
                for(int i=0;i<pValores.size();i++){
                    listaDobleCircular.insertarEnCola(new Elemento(pValores.get(i))); 
                }
                break;
        }
    }
    
    public void Ordenar(String pMetodoOrdenamiento,Listas lista) throws InterruptedException, LineUnavailableException{
        switch (pMetodoOrdenamiento) {
            case "Intercambio":
                ordenacionIntercambioAsc(lista);
                break;
            case "Seleccion":
                ordSeleccionAsc(lista);
                break;
            case "Insercion":
                ordInsercionAsc(lista);
                break;
            case "Burbuja":
                burbujaDesc(lista);
                break;
            case "Burbuja mejorado":
                bubbleSortAsc(lista);
                break;
            case "Shell":
                ordenacionShellAsc(lista);
                break;
            case "Mergesort":
                mergeSort(lista);
                break;
            case "Quicksort":
                quicksortAsc(lista);
                break;
            case "Binsort":
                System.out.println("Falta");
                break;
            case "Radixsort":
                rSort(lista);
                break;
            case "Bucketsort":
                sort(lista);
                break;
            case "Counting Sort":
                countingSort(lista);
                break;
            case "Heapsort":
                heapSort(lista);
                break;
        }
    }
}
