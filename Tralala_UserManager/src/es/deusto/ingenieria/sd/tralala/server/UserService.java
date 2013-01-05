package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.MemberJDO;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.SongJDO;

public class UserService {
	
	private SongJDO song = null;
	private MemberJDO member = null;

	public UserService(){
		song = new SongJDO();
		member = new MemberJDO();
	}
	
	public boolean login(String username, String password) {
		Member tempMem = member.get(username);
		
		if(tempMem == null){
			return false;
		} else if(!tempMem.getPass().equals(password)){
			return false;
		}else{
			return true;
		}
	}
	
	public List<Song> getSongs(){
		List<Song> tempSong = song.getSongs();
		return tempSong; 
	}
}
