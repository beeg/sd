package es.deusto.ingenieria.sd.tralala.server.data.dto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.sound.sampled.UnsupportedAudioFileException;

import es.deusto.ingenieria.sd.tralala.server.data.Song;

public class SongAssembler {
	
	public static List<SongDTO> assemble(List<Song> songs) {
		List<SongDTO> songsDTO = new ArrayList<SongDTO>();

		for (Song s : songs) {
			songsDTO.add(new SongDTO(s));
		}

		System.out.println("* Assembling List of songs ...");
		
		return songsDTO;
	}
	
	public static SongDTO assemble(Song s) {

		System.out.println("* Assembling song ...");
		
		return (s != null)?new SongDTO(s): null;
	}
	
	public static SongFileDTO assembleFile(Song s) throws UnsupportedAudioFileException, IOException{
		
		System.out.println("* Assembling song file ...");
		
		return (s != null)? new SongFileDTO(s): null;
	}
}
