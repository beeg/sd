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
	
	public void sendRecommendation(Member main, Member receiver, Song song);
	
	public void rejectRecommendation(Member main, Recommendation recommendation);
	
	public void acceptRecommendation(Member main, Recommendation recommendation);
	
	public void getRecommendations(Member main);
	
	public void addFriend(Member main, Member friend);
	
	public void removeFriend(Member main, Member friend);
	
	public void acceptFriend(Member main, Member friend);
	
	public MemberDTO findUser(String username);
	
	public List<MemberDTO> getFriends(Member main);
	
	public boolean login(String username, String password);
	
	//SongDTO to transfer it to the client, which is the reproducer?
	public byte[] play(Song song);
	
	public List<SongDTO> getFavourites(Member main);
	
	public List<SongDTO> getPermanents(Member main);
	
	public List<SongDTO> getSongs();
	
	public void addFavourite(Member main, Song song);
	
	public void removeFavourite(Member main, Song song);
	
	public void changePayment(/*ADD PAYMENTMETHODDTO HERE*/);
	
	public void addPayment(/*ADD PAYMENTMETHODDTO HERE*/);
	
	public void changePaymentType();
	
	public void /*DTO*/ getPayments(Member main);
	
	public void /*DTO*/ getCurrentPayment(Member main/*ADD PAYMENTMETHODDTO HERE*/);

	public void logout(Member main);
}
