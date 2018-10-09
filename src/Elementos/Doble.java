package Elementos;

public class Doble implements Comparadores {
	
	private double dato;
	

	public double getDato() {
		return dato;
	}
	public void setDato(double dato) {
		this.dato = dato;
	}
	
	@Override
	public boolean mayorQue(Object x){
		boolean result = getDato() > ((Doble) x).getDato();
		return result;
	}
	@Override
	public boolean menorQue(Object x){
		boolean result = getDato() < ((Doble) x).getDato();
		return result;
	}
	@Override
	public boolean mayorIgualQ(Object x){
		boolean result = getDato() >= ((Doble) x).getDato();
		return result;
	}
	@Override
	public boolean menorIgualQ(Object x){
		boolean result = getDato() <= ((Doble) x).getDato();
		return result;
	}
	@Override
	public boolean igualQue(Object x){
		boolean result = getDato() == ((Doble) x).getDato();
		return result;
	}
	@Override
	public String toString() {
		return  Double.toString(getDato());
	}
	@Override
	public double menos(Object x) {
		return (getDato() - ((Doble) x).getDato());
	}


}
