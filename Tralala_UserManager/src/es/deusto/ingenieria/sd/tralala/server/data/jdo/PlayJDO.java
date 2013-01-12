package es.deusto.ingenieria.sd.tralala.server.data.jdo;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import es.deusto.ingenieria.sd.tralala.server.data.Play;
import es.deusto.ingenieria.sd.tralala.server.data.Song;


public class PlayJDO {
	private PersistenceManager pm = null;
	public PlayJDO(){
		pm = DAO.getInstance().connect();
	}
	
	public void store(Play play){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		pm.makePersistent(play);
		tx.commit();
	}
	
	public void remove(Play play){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		pm.deletePersistent(play);
		tx.commit();
	}
	
	
	public List<Play> getPlays(String login){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		//Query q = pm.newQuery(Play.class, "MEMBER_LOGIN_OID == log");
		//q.declareParameters ("String log");
		Query q = pm.newQuery("SELECT FROM " + Play.class.getName()); //+ " WHERE MEMBER_LOGIN_OID == '" + login + "'");
		@SuppressWarnings("unchecked")
		List<Play> listPlays = (List<Play>) q.execute();
		tx.commit();
		System.out.println(listPlays.size());
		List<Play> aux = new ArrayList<Play> ();
		for(int i=0;i<listPlays.size();i++){
			if(listPlays.get(i).getMember().getLogin().equals(login)){
				aux.add(listPlays.get(i));
			}
		}
		return aux;
	}
}
