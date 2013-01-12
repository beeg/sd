package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

import es.deusto.ingenieria.sd.tralala.server.data.Song;

public class SongDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String title;
	private String artist;
	private String album;
	private String lyrics;
	long releaseDate;
	int duration;
	
	public SongDTO(Song s)	{
		title=s.getTitle();
		artist=s.getArtist();
		album=s.getAlbum();
		releaseDate=s.getReleaseDate();
		duration=s.getDuration();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public long getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(long releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String toString(){
		return title;
	}
	
	public Object[] getFields(){
		return new Object[]{this, artist, album, releaseDate, duration};
	}
	
	public static String[] getFieldNames(){
		return new String[]{"Title", "Artist", "album", "Release date", "Duration"};
	}
	
}
