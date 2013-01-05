package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.MemberJDO;

public class UserService {
	
	private MemberJDO member = null;

	public UserService(){
		member = new MemberJDO();
	}
	
	public boolean login(String username, String password) {
		Member tempMem = member.get(username);
		
		if(tempMem == null){
			return false;
		} else if(!tempMem.getPass().equals(password)){
			return false;
		}else{
			return true;
		}
	}
	
	public void sendRecommendation(Member main, Member receiver, Song song) {
		
	}
	
	public void rejectRecommendation(Member main, Recommendation recommendation) {
		
	}
	
	public void acceptRecommendation(Member main, Recommendation recommendation) {
		
	}
	
	public void getRecommendations(Member main) {

	}
	
	public void addFriend(Member main, Member friend) {

	}

	public void removeFriend(Member main, Member friend) {

	}

	public void acceptFriend(Member main, Member friend) {

	}
	
	public MemberDTO findUser(String username) {
		return null;
	}

	public List<MemberDTO> getFriends(Member main) {
		return null;
	}

	
	public void addFavourite(Member main, Song song) {
		// TODO Auto-generated method stub
		
	}

	public void removeFavourite(Member main, Song song) {
		// TODO Auto-generated method stub
		
	}

	public void changePayment() {
		// TODO Auto-generated method stub
		
	}

	public void addPayment() {
		// TODO Auto-generated method stub
		
	}

	public void changePaymentType() {
		// TODO Auto-generated method stub
		
	}

	public void getPayments(Member main) {
		// TODO Auto-generated method stub
		
	}

	public void getCurrentPayment(Member main) {
		// TODO Auto-generated method stub
		
	}

	public void logout(Member main) {
		// TODO Auto-generated method stub
		
	}
}
