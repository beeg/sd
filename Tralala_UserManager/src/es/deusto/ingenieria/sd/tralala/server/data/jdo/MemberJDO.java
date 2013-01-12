package es.deusto.ingenieria.sd.tralala.server.data.jdo;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import javax.jdo.Query;

import es.deusto.ingenieria.sd.tralala.server.data.Member;

public class MemberJDO {
	private PersistenceManager pm = null;
	
	public MemberJDO(){
		pm = DAO.getInstance().connect();
	}
	
	public void store(Member mem){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		pm.makePersistent(mem);
		tx.commit();
	}
	
	public void remove(Member m){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		pm.deletePersistent(m);
		tx.commit();
	}
	
	public Member get(String username){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		Query query = pm.newQuery("SELECT FROM " + Member.class.getName() + " WHERE login == '" + username + "'");
		query.setUnique(true);
		Member tempMem = (Member)query.execute();
		tx.commit();
		return tempMem;
	}
	
	public List<Member> getMembers(){
		Transaction tx = pm.currentTransaction();
		tx.begin();
		Query query = pm.newQuery("SELECT FROM " + Member.class.getName());
		@SuppressWarnings("unchecked")
		List<Member> listMembers = (List<Member>) query.execute();
		tx.commit();
		
		return listMembers;
	}
}
