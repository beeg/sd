package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.Date;

public class Play {

	Date date;
	Date startTime; //Con un solo Date deberia bastar creo yo
	Member member;
	Song song;
	
	public Play(Date date, Date startTime, Member member, Song song) {
		super();
		this.date = date;
		this.startTime = startTime;
		this.member = member;
		this.song = song;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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
}
