package es.deusto.ingenieria.sd.tralala.server;

import java.util.HashSet;
import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.SearchStrategy;
import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.MemberJDO;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.SongJDO;

public class SongService {

	private SearchStrategy myStrategy;
	private SongJDO song;
	private MemberJDO member;

	public SongService(){
		song = new SongJDO();
		member = new MemberJDO();
		myStrategy = new SongByTitle();
	}
	
	
	public List<Song> getSongs(){
		return song.getSongs();
	}
	
	public Song play(String song) {
		return this.song.get(song);
	}
	
	public List<Song> getFavourites(String username) {
		System.out.println("Username: "+username);
		Member m =member.get(username);
		System.out.println("Member en songservice: "+m);
		return m.getFavorites();
	}

	public List<Song> getPermanents(String username) {
		Member m =member.get(username);
		return m.getPermanents();
	}


	public SearchStrategy getMyStrategy() {
		return myStrategy;
	}


	public void setMyStrategy(SearchStrategy myStrategy) {
		System.out.println("SongService. strategy stted");
		this.myStrategy = myStrategy;
	}
	
}
