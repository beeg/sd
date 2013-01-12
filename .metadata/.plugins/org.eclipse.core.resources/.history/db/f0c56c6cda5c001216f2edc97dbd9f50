package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import es.deusto.ingenieria.sd.tralala.server.data.Song;

public class SongFileDTO {

	private byte[] data;
	private AudioFormat format;
	private String lyrics;
	
	public SongFileDTO(Song s) throws UnsupportedAudioFileException, IOException {
		super();
		File f = new File(s.getPath());
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(f);
		format = audioInputStream.getFormat();
		data = Files.readAllBytes(f.toPath());
		lyrics = s.getLyrics();
	}
	
	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public AudioFormat getFormat() {
		return format;
	}

	public void setFormat(AudioFormat format) {
		this.format = format;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}	
}
