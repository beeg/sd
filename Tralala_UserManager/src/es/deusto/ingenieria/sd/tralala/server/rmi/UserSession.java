package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.SongService;
import es.deusto.ingenieria.sd.tralala.server.UserService;
import es.deusto.ingenieria.sd.tralala.server.data.Member;
import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;

public class UserSession extends UnicastRemoteObject implements IUserSession{

	private SongService songManager;
	private UserService userManager;
	private static final long serialVersionUID = 1L;

	public UserSession() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendRecommendation(Member main, Member receiver, Song song) {
		// TODO Auto-generated method stub
		userManager.sendRecommendation(main, receiver, song);
	}

	@Override
	public void rejectRecommendation(Member main, Recommendation recommendation) {
		// TODO Auto-generated method stub
		userManager.rejectRecommendation(main, recommendation);
	}

	@Override
	public void acceptRecommendation(Member main, Recommendation recommendation) {
		// TODO Auto-generated method stub
		userManager.acceptRecommendation(main, recommendation);
	}

	@Override
	public void getRecommendations(Member main) {
		// TODO Auto-generated method stub
		userManager.getRecommendations(main);
	}

	@Override
	public void addFriend(Member main, Member friend) {
		// TODO Auto-generated method stub
		userManager.addFriend(main, friend);
	}

	@Override
	public void removeFriend(Member main, Member friend) {
		// TODO Auto-generated method stub
		userManager.removeFriend(main, friend);
	}

	@Override
	public void acceptFriend(Member main, Member friend) {
		// TODO Auto-generated method stub
		userManager.acceptFriend(main, friend);
	}

	@Override
	public MemberDTO findUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> getFriends(Member main) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return userManager.login(username, password);
	}

	@Override
	public byte[] play(Song song) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<SongDTO> getFavourites(Member main) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SongDTO> getPermanents(Member main) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SongDTO> getSongs() {
		// TODO Auto-generated method stub
		songManager.getSongs();
		return null;
	}

	@Override
	public void addFavourite(Member main, Song song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFavourite(Member main, Song song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePaymentType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPayments(Member main) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCurrentPayment(Member main) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(Member main) {
		// TODO Auto-generated method stub
		
	}

}
