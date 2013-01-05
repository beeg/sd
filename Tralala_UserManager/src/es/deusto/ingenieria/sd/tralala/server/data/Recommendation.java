package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.Date;

public class Recommendation {
	
	int id; // Otro atributo que dudo que sea necesario
	Date date;
	boolean accepted;
	Member sender;
	Member receiver;
	Song song;
	
	public Recommendation(int id, Date date, boolean accepted, Member sender,
			Member receiver, Song song) {
		super();
		this.id = id;
		this.date = date;
		this.accepted = accepted;
		this.sender = sender;
		this.receiver = receiver;
		this.song = song;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public Member getSender() {
		return sender;
	}

	public void setSender(Member sender) {
		this.sender = sender;
	}

	public Member getReceiver() {
		return receiver;
	}

	public void setReceiver(Member receiver) {
		this.receiver = receiver;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	
}
