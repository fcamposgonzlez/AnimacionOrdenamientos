package Ordenacion;

import javax.sound.sampled.*;

public class Sound {

	public static float frecuencia = 8000f;

	public static void tono(int hz, int msecs) throws LineUnavailableException {
		tono(hz, msecs, 1.0);
	}

	public static void tono(int hz, int msecs, double vol) throws LineUnavailableException {
		byte[] buf = new byte[1];
		AudioFormat af = new AudioFormat(frecuencia, // sampleRate
				8, 1, true, false);
            try (SourceDataLine sonido = AudioSystem.getSourceDataLine(af)) {
                sonido.open(af);
                sonido.start();
                for (int i = 0; i < msecs * 8; i++) {
                    double angle = i / (frecuencia / hz) * 2.0 * Math.PI;
                    buf[0] = (byte) (Math.sin(angle) * 127.0 * vol);
                    sonido.write(buf, 0, 1);
                }
                sonido.drain();
                sonido.stop();
            }
	}
}