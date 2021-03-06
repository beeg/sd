package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.SongJDO;

public class SongByArtist implements SearchStrategy{

	public List<Song> getSong(String name) {
		System.out.println("Search by artist");
		return new SongJDO().getSongByArtist(name);
	}

}
