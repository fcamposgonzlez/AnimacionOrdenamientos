package Listas;

import Elementos.Elemento;

public class ListaDobCir implements Listas{
	private Nodo cabeza;
	private Nodo cola;

	public ListaDobCir() {
		cabeza = null;
		cola = null;
	}
	@Override
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	@Override
	public Nodo getCola() {
		return cola;
	}
	public void setCola(Nodo cola) {
		this.cola = cola;
	}

	@Override
	public ListaDobCir insertarEnCabeza(Elemento entrada) {
		Nodo nuevo = new Nodo(entrada);
		if (vacia()){
			nuevo.enlace = nuevo;
			nuevo.enlaceAnte = nuevo;
			cola = nuevo;
		}
		else{
			nuevo.enlace = cabeza;
			nuevo.enlaceAnte = cola;
			nuevo.enlace.enlaceAnte=nuevo;
			cola.enlace = nuevo;
		}
		cabeza = nuevo;
		return this;
	}
	@Override
	public Nodo buscarElementoAnterior(Nodo destino){
		Nodo indice;
		for(indice = cabeza; indice.enlace != cabeza; indice = indice.enlace){
			if (destino == indice.enlace)
				return indice;
		}
		if (destino == indice.enlace)
			return indice;
		return null;
	}
	@Override
	public void eliminarCola(){
		Nodo aux;
		aux = buscarElementoAnterior(cola);
		if(aux == null){
			cola =  null;
			cabeza = null;
			System.gc();
		}
		else{
			aux.enlace = null;
			cola = null;
			System.gc();
			cola = aux;
			cola.enlace = cabeza;
			cabeza.enlaceAnte = cola;
		}
		
	}
	@Override 
	public void eliminarCabeza(){
		Nodo aux;
		aux = cabeza.enlace;
		if(aux == null){
			cola =  null;
			cabeza = null;
			System.gc();
		}
		else{
			cabeza.enlace = null;
			cabeza = aux;
			cabeza.enlaceAnte = cola;
			System.gc();
			cola.enlace = cabeza;
		}
	}
	@Override
	public Object insertarEnCola(Elemento x){
		Nodo nuevo = new Nodo(x);
		if (vacia()){
			nuevo.enlace = nuevo;
			nuevo.enlaceAnte = nuevo;
			cola = nuevo;
			cabeza = nuevo;
		}
		else{
			cola.enlace = new Nodo(x);
			cola.enlace.enlaceAnte = cola;
			cola = cola.enlace;
			cola.enlace = cabeza;
		}
		return this;
	}
	@Override
	public boolean vacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}
	@Override
	public void mostrar() {
		Nodo n;
		int k = 0;
		n = cabeza;
		while (n.enlace != cabeza) {
			System.out.printf(n.dato.toString(), "->");
			n = n.enlace;
			k++;
			System.out.print((k % 27 != 0 ? " " : "\n"));
		}
		System.out.printf(n.dato.toString(), "->");
		System.out.printf("\n");
		if (vacia())
			System.out.println("la lista está vacía, ... no se generaron numeros...");
	
	}
	@Override
	public Nodo buscarNodo(int pos){
		Nodo aux=cabeza;
		int cont = 0;
		if (pos < 0 || pos >= lenght()) {
			System.out.println("La posicion insertada no es correcta");
		} else {
			while (aux.enlace != cabeza) {
				if (pos == cont) {
					return aux;
				}
				aux = aux.getEnlace();
				cont++;
			}
		}
		return aux;
	}
	@Override
	public int lenght(){
		Nodo aux;
		int numElementos = 0;
		aux = cabeza;
		while(aux.enlace != cabeza){
			numElementos++;
			aux = aux.enlace;
		}
		numElementos++;
		return numElementos;
	}
	
	@Override
	public void intercambiar (int pos1, int pos2) {
		if (pos1 < lenght() && pos2 < lenght ())    {
	        Nodo reco1 = cabeza;
	        for (int f = 0 ; f < pos1 ; f++)
	            reco1 = reco1.enlace;
	        Nodo reco2 = cabeza;
	        for (int f = 0 ; f < pos2 ; f++)
	            reco2 = reco2.getEnlace();
	        Elemento aux = reco1.getDato();
	        reco1.setDato(reco2.getDato());
	        reco2.setDato(aux);
		}
	}
}