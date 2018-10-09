package Ordenacion;
import Listas.*;
import javax.sound.sampled.LineUnavailableException;


public class Intercambiar {
	public static void intercambiar(Object a, int i, int j) throws InterruptedException, LineUnavailableException {
                Sound.tono(i*500,10);
		((Listas)a).intercambiar (i, j);
                Sound.tono(j*500,10);
	}
}