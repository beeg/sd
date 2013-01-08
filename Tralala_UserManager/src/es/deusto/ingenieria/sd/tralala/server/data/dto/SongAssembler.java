package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.util.ArrayList;
import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.data.Song;

public class SongAssembler {
	
	public static List<SongDTO> assemble(List<Song> songs) {
		List<SongDTO> songsDTO = new ArrayList<SongDTO>();

		for (Song s : songs) {
			songsDTO.add(new SongDTO(s));
		}

		System.out.println("* Assembling List of members ...");
		
		return songsDTO;
	}
	
	public static SongDTO assemble(Song s) {

		System.out.println("* Assembling member ...");
		
		return new SongDTO(s);
	}
}
