package Elementos;

public class Elemento{
	private Object dato;
	
	public Elemento(){;}
	
	public Elemento(int x) {
		dato = new Entero();
		((Entero) dato).setNumero(x);
	}
	
	public Elemento(int num, int den) {
		dato = new Racional();
		((Racional) dato).setNumerador(num);
		((Racional) dato).setDenominador(den);
	}
	
	public Elemento(String x) {
		dato = new Strings();
		((Strings) dato).setString(x);
	}
	
	public Elemento(double num) {
		dato = new Doble();
		((Doble)dato).setDato(num);
	}
	
	public Elemento(char cara) {
		dato = new Char();
		((Char) dato).setCaracter(cara);
	}
	
	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return dato.toString();
	}
	
	
}
