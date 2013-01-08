package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.Remote;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;

public interface IUserSession extends Remote{

	/* How are we sending members through the network? */
	
	public void sendRecommendation(String user, String friend, String songName);
	
	public void rejectRecommendation(String user, Recommendation recommendation);
	
	public void acceptRecommendation(String user, Recommendation recommendation);
	
	public void getRecommendations(String user);
	
	public void addFriend(String user, String friend);
	
	public void removeFriend(String user, String friend);
	
	public void acceptFriend(String user, String friend);
	
	public MemberDTO findUser(String username);
	
	public List<MemberDTO> getFriends(String user);
	
	public MemberDTO login(String username, String password);
	
	//SongDTO to transfer it to the client, which is the reproducer?
	public byte[] play(String songname);
	
	public List<SongDTO> getFavourites(String user);
	
	public List<SongDTO> getPermanents(String user);
	
	public List<SongDTO> getSongs();
	
	public void addFavourite(String user, String song);
	
	public void removeFavourite(String user, String song);
	
	public void changePayment(/*ADD PAYMENTMETHODDTO HERE*/);
	
	public void addPayment(/*ADD PAYMENTMETHODDTO HERE*/);
	
	public void changePaymentType();
	
	public void /*DTO*/ getPayments(String user);
	
	public void /*DTO*/ getCurrentPayment(String user/*ADD PAYMENTMETHODDTO HERE*/);

	public void logout(String user);
}
