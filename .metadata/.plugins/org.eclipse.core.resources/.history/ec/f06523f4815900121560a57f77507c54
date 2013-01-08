package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Song {
	
	String title;
	String artist;
	String album;
	String lyrics;
	Date releaseDate;
	int duration;
	double price;
	List<Play> plays;
	
	public Song(String title, String artist, String album, String lyrics,
			Date releaseDate, int duration, double price) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.lyrics = lyrics;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.price = price;
		this.plays = new ArrayList<Play>();
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
	
	public String getLyrics() {
		return lyrics;
	}
	
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public List<Play> getPlays(){
		return plays;
	}
	
	public void setPlays(List<Play> plays){
		this.plays = plays;
	}
}
