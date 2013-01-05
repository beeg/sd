package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Member {
	
	String nick;
	String pass;
	String email;
	String descr;
	int points;
	List<Song> favourites;
	List<Song> permanentCollection;
	List<Recommendation> sentRecommendations;
	List<Recommendation> pendingRecommendation;
	List<Member> friends;
	List<Play> playedSongs;
	
	public Member(String nick, String pass, String email, String descr,
			int points) {
		super();
		this.nick = nick;
		this.pass = pass;
		this.email = email;
		this.descr = descr;
		this.points = points;
		this.favourites = new ArrayList<Song>();
		this.permanentCollection = new ArrayList<Song>();
		this.sentRecommendations = new ArrayList<Recommendation>();
		this.pendingRecommendation = new ArrayList<Recommendation>();
		this.friends = new ArrayList<Member>();
		this.playedSongs = new ArrayList<Play>();
	}

	public Member(String nick, String pass, String email, String descr,
			int points, List<Song> favourites, List<Song> permanentCollection,
			List<Recommendation> sentRecommendations,
			List<Recommendation> pendingRecommendation, List<Member> friends,
			List<Play> playedSongs) {
		super();
		this.nick = nick;
		this.pass = pass;
		this.email = email;
		this.descr = descr;
		this.points = points;
		this.favourites = favourites;
		this.permanentCollection = permanentCollection;
		this.sentRecommendations = sentRecommendations;
		this.pendingRecommendation = pendingRecommendation;
		this.friends = friends;
		this.playedSongs = playedSongs;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public List<Song> getFavourites() {
		return favourites;
	}

	public void setFavourites(List<Song> favourites) {
		this.favourites = favourites;
	}

	public List<Song> getPermanentCollection() {
		return permanentCollection;
	}

	public void setPermanentCollection(List<Song> permanentCollection) {
		this.permanentCollection = permanentCollection;
	}

	public List<Recommendation> getSentRecommendations() {
		return sentRecommendations;
	}

	public void setSentRecommendations(List<Recommendation> sentRecommendations) {
		this.sentRecommendations = sentRecommendations;
	}

	public List<Recommendation> getPendingRecommendation() {
		return pendingRecommendation;
	}

	public void setPendingRecommendation(List<Recommendation> pendingRecommendation) {
		this.pendingRecommendation = pendingRecommendation;
	}

	public List<Member> getFriends() {
		return friends;
	}

	public void setFriends(List<Member> friends) {
		this.friends = friends;
	}

	public List<Play> getPlayedSongs() {
		return playedSongs;
	}

	public void setPlayedSongs(List<Play> playedSongs) {
		this.playedSongs = playedSongs;
	}
}
