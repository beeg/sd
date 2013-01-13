package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import es.deusto.ingenieria.sd.tralala.server.data.Song;

public class SongFileDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private byte[] data;
	private SerializableAudioFormat format;
	private String lyrics;
	
	public SongFileDTO(Song s) throws UnsupportedAudioFileException, IOException {
		super();
		File f = new File(s.getPath());
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(f);
		format = new SerializableAudioFormat(audioInputStream.getFormat());
		data = Files.readAllBytes(f.toPath());
		lyrics = s.getLyrics();
	}
	
	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public SerializableAudioFormat getFormat() {
		return format;
	}

	public void setFormat(SerializableAudioFormat format) {
		this.format = format;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
}
