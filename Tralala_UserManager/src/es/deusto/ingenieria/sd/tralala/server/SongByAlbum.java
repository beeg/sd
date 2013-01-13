package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.SongJDO;

public class SongByAlbum implements SearchStrategy{

	public List<Song> getSong(String name) {
		System.out.println("Search by Album");
		return new SongJDO().getSongByAlbum(name);
	}
}
