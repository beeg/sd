package es.deusto.ingenieria.sd.tralala.server.data.jdo;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public class DAO {
	private static DAO daoMan = new DAO();
	private PersistenceManager pm = null;
	private PersistenceManagerFactory pmf = null;
	
	private DAO(){
		
	}
	
	public static DAO getInstance(){
		return daoMan;
	}

	public synchronized PersistenceManager connect(){
		if(pm == null && pmf == null){
			try{
				pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
				pm = pmf.getPersistenceManager();		
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return pm;
	}
}
