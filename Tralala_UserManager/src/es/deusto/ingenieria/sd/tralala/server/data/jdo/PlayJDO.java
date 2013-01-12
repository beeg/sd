package es.deusto.ingenieria.sd.tralala.server.data.jdo;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import es.deusto.ingenieria.sd.tralala.server.data.Play;


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
}
