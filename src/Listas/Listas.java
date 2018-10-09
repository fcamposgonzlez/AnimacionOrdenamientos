package Listas;

import Elementos.Elemento;

public interface Listas {
	public boolean vacia();
	public void mostrar();
	public Object buscarNodo(int pos);
	public int lenght();
	public Object getCabeza(); 
	public Object getCola();
	public void intercambiar (int pos1, int pos2);
	public Object insertarEnCola (Elemento x);
	public Object insertarEnCabeza(Elemento x);
	public void eliminarCola();
	public void eliminarCabeza();
	public Nodo buscarElementoAnterior(Nodo destino);
}
