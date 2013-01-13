package es.deusto.ingenieria.sd.tralala.server.data.jdo;

import java.util.List;
import java.util.ArrayList;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;
import es.deusto.ingenieria.sd.tralala.server.data.Song;


public class SongJDO {
	private PersistenceManager pm = null;
	
	public SongJDO(){
		pm = DAO.getInstance().connect();
	}
	
	public void store(Song song){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		pm.makePersistent(song);
		tx.commit();
	}
	
	public void remove(Song song){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		pm.deletePersistent(song);
		tx.commit();
	}
	
	public Song get(String name){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		Query query = pm.newQuery("SELECT FROM " + Song.class.getName() + " WHERE title == '" + name + "'");
		query.setUnique(true);
		Song tempSong = (Song)query.execute();
		tx.commit();
		
		return tempSong;
	}
	
	public List<Song> getSongByArtist(String name){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		List<Song> aux = new ArrayList<Song> ();
		Query q = pm.newQuery("SELECT FROM " + Song.class.getName());
		@SuppressWarnings("unchecked")
		List<Song> songs = (List<Song>)q.execute();
		tx.commit();
		for(Song s: songs)	{
		  if(s.getArtist().equals(name))	{
				  aux.add(s);
		  }
		}
		return aux; 
	}
	
	public List<Song> getSongByAlbum(String name){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		List<Song> aux = new ArrayList<Song> ();
		Query q = pm.newQuery("SELECT FROM " + Song.class.getName());
		List<Song> songs = (List<Song>)q.execute();
		tx.commit();
		for(Song s: songs)	{
		  if(s.getAlbum().equals(name))	{
				  aux.add(s);
		  }
		}
		return aux;
	}
	
	public List<Song> getSongs(){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		Query query = pm.newQuery("SELECT FROM " + Song.class.getName());
		@SuppressWarnings("unchecked")
		List<Song> listSongs = (List<Song>) query.execute();
		tx.commit();
		
		return listSongs;
	}
}
