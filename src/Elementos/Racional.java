package Elementos;

public class Racional implements Comparadores {
	private int numerador;
	private int denominador;
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	@Override
	public boolean mayorQue(Object x){
		boolean result = ((float)((float)this.numerador/(float)this.denominador)) > ((float)((float)((Racional) x).getNumerador()/(float)((Racional) x).getDenominador()));
		return result;
	}
	@Override
	public boolean menorQue(Object x){
		boolean result = ((float)((float)this.numerador/(float)this.denominador)) < ((float)((float)((Racional) x).getNumerador()/(float)((Racional) x).getDenominador()));
		return result;
	}
	@Override
	public boolean mayorIgualQ(Object x){
		boolean result = ((float)((float)this.numerador/(float)this.denominador)) >= ((float)((float)((Racional) ((Elemento) x).getDato()).getNumerador()/(float)((Racional) ((Elemento) x).getDato()).getDenominador()));
		return result;
	}
	@Override
	public boolean menorIgualQ(Object x){
		boolean result = ((float)((float)this.numerador/(float)this.denominador)) <= ((float)((float)((Racional) x).getNumerador()/(float)((Racional) x).getDenominador()));
		return result;
	}
	@Override
	public boolean igualQue(Object x){
		boolean result = ((float)((float)this.numerador/(float)this.denominador)) == ((float)((float)((Racional) ((Elemento) x).getDato()).getNumerador()/(float)((Racional) ((Elemento) x).getDato()).getDenominador()));
		return result;
	}
	@Override
	public String toString() {
		return Integer.toString(numerador) + "/" + Integer.toString(denominador);
	}
	@Override
	public double menos(Object x) {
		return ((float)((float)this.numerador/(float)this.denominador)) - ((float)((float)((Racional) ((Elemento) x).getDato()).getNumerador()/(float)((Racional) ((Elemento) x).getDato()).getDenominador()));
	}
}
