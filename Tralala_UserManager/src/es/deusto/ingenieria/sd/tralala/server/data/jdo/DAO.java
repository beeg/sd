package es.deusto.ingenieria.sd.tralala.server.data.jdo;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Song;

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
	public static void main(String[] args){
		Member rezo= new MemberJDO().getMembers().get(0);
//		rezo.getFavorites().add(new Song("a","a",1,1,"b","b","b"));
//		String lyrics = "The story behind the painting I drew is already told\nNo more tearstains on the pages of my diary\n" +
//					"Tired but unable to give up since I`m\n" + "Responsible for the lives I saved\n\n" + "The play is done\n" +
//"The curtain`s down\n\n" + "All the tales are told\n" + "All the orchids gone\n" +"Lost in my own world\n" +
//"Now I care for dead gardens\n\n" + "My song is little worth anymore\n" + "Time to lay this weary pen aside\n" +
//"The play is done\n" + "The curtain`s down\n\n"+ "Where are the wolves, the underwater moon\n" +" The elvenpath, the haven of youth\n" +
//"Lagoons of the starlit sea\n\n" + "Have I felt enough for one man`s deed?\n" + "Or is it time to challenge the Ancient of Days\n" + 
//"And let the virgin conceive\n" + "All the tales are told\n" + "All the orchids gone\n" +" All the tales are told\n" +
//"All the orchids gone\n" + "Lost in my own world\n" + "Now I care for dead gardens\n";
//		
//		rezo.getFavorites().add(new Song("Dead Gardens", "Nightwish", 428, 0, lyrics, "Once", "/home/song.wav"));
//		new MemberJDO().store(rezo);
//		System.out.println(new MemberJDO().getMembers().size());
		Member aimar = new Member("Aimar","aimarpass");
		Member begoña = new Member("Begoña","begopass");
		Member david = new Member("David","davidpass");
		Member aritz = new Member("Aritz","aritzpass");
		
		aimar.getContacts().add(begoña);
		aimar.getContacts().add(david);
		aimar.getContacts().add(aritz);

		begoña.getContacts().add(aimar);
		begoña.getContacts().add(david);
		begoña.getContacts().add(aritz);
		
		david.getContacts().add(aimar);
		david.getContacts().add(begoña);
		david.getContacts().add(aritz);
		
		aritz.getContacts().add(aimar);
		aritz.getContacts().add(begoña);
		aritz.getContacts().add(david);

		new MemberJDO().store(aimar);
		new MemberJDO().store(begoña);
		new MemberJDO().store(david);
		new MemberJDO().store(aritz);
		

	}

}
