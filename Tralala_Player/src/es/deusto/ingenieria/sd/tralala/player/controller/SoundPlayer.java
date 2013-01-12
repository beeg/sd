package es.deusto.ingenieria.sd.tralala.player.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;


public class SoundPlayer{
	private static SoundPlayer instance;
	private Thread currentPlay = new Thread();
	
	private SoundPlayer(){
		
	}
	
	public static SoundPlayer getInstance(){
		if(instance == null){
			instance = new SoundPlayer();
		}
		return instance;
	}
	
	public void playSong(final byte[] data, final AudioFormat format) 
	{ 
		if(currentPlay != null && currentPlay.isAlive()){
			currentPlay.interrupt();
		}
		currentPlay = new Thread(){
		
		public void run(){
				try {
					Clip soundClip = AudioSystem.getClip();
					soundClip.open(format, data, 0, data.length);
					soundClip.loop(0);
					Thread.sleep(1000);
					while (soundClip.isRunning()){
						if (Thread.currentThread().isInterrupted()) {
							soundClip.stop();
							break;
						}
					}
				soundClip.close();
				} catch(InterruptedException e){
				//TODO
					e.printStackTrace();
				} catch (Exception e) {
					//TODO
					e.printStackTrace();
				}
			} 
		};
		currentPlay.start();
	}
	
	public static void main(String [] args) throws UnsupportedAudioFileException, IOException{
		File f = new File("lib/coins_1.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(f);
		SoundPlayer s = SoundPlayer.getInstance();
		s.playSong(Files.readAllBytes(f.toPath()), audioInputStream.getFormat());		
	}
}
