package es.deusto.ingenieria.sd.tralala.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Song {
	private String title;
	private String artist;
	private int duration;
	private long releaseDate;
	private String lyrics;
	private String album;
	private String path;
	public Song(String title, String artist, int duration, long releaseDate,
			String lyrics, String album,String path) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.lyrics = lyrics;
		this.album = album;
		this.path=path;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public long getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(long releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
