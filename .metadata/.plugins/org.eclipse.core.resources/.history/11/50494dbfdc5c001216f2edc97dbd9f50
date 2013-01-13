package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Member {
	@PrimaryKey
	private String login;
	private String password;
	private String email;
	private String descript;
	private int points;
	private List<Member> contacts;
	private List<Song>favorites;
	private List<Song>permanents;
	
	public Member() {
		login = "admin";
		password = "admin";
		contacts = new ArrayList<Member>();
		favorites=new ArrayList<Song>();
		permanents=new ArrayList<Song>();
	}

	public Member(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Member(String login, String password,String email, String descript,int points, List<Member> contacts, List<Song>favorites, List<Song>permaments) {
		super();
		this.login = login;
		this.password = password;
		this.email=email;
		this.descript=descript;
		this.points=points;
		this.contacts = contacts;
		this.favorites=favorites;
		this.permanents=permanents;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Member> getContacts() {
		return contacts;
	}

	public void setContacts(List<Member> contacts) {
		this.contacts = contacts;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public List<Song> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Song> favorites) {
		this.favorites = favorites;
	}

	public List<Song> getPermanents() {
		return permanents;
	}

	public void setPermanents(List<Song> permanents) {
		this.permanents = permanents;
	}
	
	
}
