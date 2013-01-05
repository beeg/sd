package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.SongJDO;

public class SongService {

	private PlayStrategy myStrategy;
	private SongJDO song = null;

	public SongService(){
		song = new SongJDO();
	}
	
	
	public List<Song> getSongs(){
		return song.getSongs();
	}
	
	public byte[] play(Song song) {
		// TODO Auto-generated method stub
		return null;
		
	}
	
	public List<SongDTO> getFavourites(Member main) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SongDTO> getPermanents(Member main) {
		// TODO Auto-generated method stub
		return null;
	}
}
