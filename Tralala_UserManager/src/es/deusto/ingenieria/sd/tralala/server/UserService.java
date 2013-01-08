package es.deusto.ingenieria.sd.tralala.server;

import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.jdo.MemberJDO;

public class UserService {
	
	private MemberJDO member = null;

	public UserService(){
		member = new MemberJDO();
	}
	
	public Member login(String username, String password) {
		Member tempMem = member.get(username);
		
		if(tempMem == null){
			return null;
		} else if(!tempMem.getPass().equals(password)){
			return null;
		}else{
			return tempMem;
		}
	}
	
	public void sendRecommendation(String user, String receiver, String songName) {
		
	}
	
	public void rejectRecommendation(String user, Recommendation recommendation) {
		
	}
	
	public void acceptRecommendation(String user, Recommendation recommendation) {
		
	}
	
	public void getRecommendations(String user) {

	}
	
	public void addFriend(String user, String friend) {

	}

	public void removeFriend(String user, String friend) {

	}

	public void acceptFriend(String user, String friend) {

	}
	
	public Member findUser(String username) {
		return member.get(username);
	}

	public List<MemberDTO> getFriends(String user) {
		return null;
	}

	
	public void addFavourite(String user, String songName) {
		// TODO Auto-generated method stub
		
	}

	public void removeFavourite(String user, String songName) {
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

	public void getPayments(String user) {
		// TODO Auto-generated method stub
		
	}

	public void getCurrentPayment(String user) {
		// TODO Auto-generated method stub
		
	}

	public void logout(String user) {
		// TODO Auto-generated method stub
		
	}
}
