package app;

import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;

//import javax.sound.midi;
//import javax.sound.midi.spi;

public class Sonido {
	
	private File clip;
	
	public Sonido(File archivo){
		setClip(archivo);
	}
	

	public Sonido() {
		// TODO Auto-generated constructor stub
	}


	public File getClip() {
		return clip;
	}

	public void setClip(File archivo) {
		this.clip = archivo;
	}
	
	public void play() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		Clip sonido = AudioSystem.getClip();
		//File a = new File("c:\\sonidos\\sonido1.wav");
		sonido.open(AudioSystem.getAudioInputStream(clip));
		sonido.start();
	    Thread.sleep(400); 
		sonido.close();

	}
	
}
