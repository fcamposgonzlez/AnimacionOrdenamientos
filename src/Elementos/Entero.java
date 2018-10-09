package Elementos;

public class Entero implements Comparadores{
	private int numero;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public boolean mayorQue(Object x){
		//System.out.println(Integer.toString((int)((Entero) x).getNumero()));
		boolean result = this.numero > (int)((Entero) x).getNumero();
		return result;
	}
	@Override
	public boolean menorQue(Object x){
		boolean result = this.numero < ((int)((Entero) x).getNumero());
		return result;
	}
	@Override
	public boolean mayorIgualQ(Object x){
		boolean result = this.numero >= ((Entero) ((Elemento) x).getDato()).getNumero();
		return result;
	}
	@Override
	public boolean menorIgualQ(Object x){
		boolean result = this.numero <= ((int)((Entero) x).getNumero());
		return result;
	}
	@Override
	public boolean igualQue(Object x){
		boolean result = this.numero == ((Entero) ((Elemento) x).getDato()).getNumero();
		return result;
	}
	@Override
	public String toString() {
		return  Integer.toString(numero);
	}
	@Override
	public double menos(Object x) {
		return this.numero - ((Entero) ((Elemento) x).getDato()).getNumero();
	}
	
}
