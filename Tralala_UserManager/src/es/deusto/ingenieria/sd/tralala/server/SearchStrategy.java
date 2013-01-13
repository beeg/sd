package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.data.*;

public interface SearchStrategy {

	public List<Song> getSong(String name);
}
