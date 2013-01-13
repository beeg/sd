package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.SongJDO;

public class SongByTitle implements SearchStrategy{

	public List<Song> getSong(String name) {
		System.out.println("search by title");
		return new SongJDO().getSong(name);
	}
}
