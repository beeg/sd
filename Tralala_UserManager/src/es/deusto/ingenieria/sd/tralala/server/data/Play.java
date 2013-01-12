package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Play {
	private Member member;
	private Song song;
	private Date date;
	public Play(Member member, Song song, Date date){
		this.member=member;
		this.song=song;
		this.date=date;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
