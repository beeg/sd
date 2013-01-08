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
	public void sendRecommendation(String user, String friend, String songName) {
		// TODO Auto-generated method stub
		userManager.sendRecommendation(main, receiver, song);
	}

	@Override
	public void rejectRecommendation(String user, Recommendation recommendation) {
		// TODO Auto-generated method stub
		userManager.rejectRecommendation(main, recommendation);
	}

	@Override
	public void acceptRecommendation(String user, Recommendation recommendation) {
		// TODO Auto-generated method stub
		userManager.acceptRecommendation(main, recommendation);
	}

	@Override
	public void getRecommendations(String user) {
		// TODO Auto-generated method stub
		userManager.getRecommendations(main);
	}

	@Override
	public void addFriend(String user, String friend) {
		// TODO Auto-generated method stub
		userManager.addFriend(main, friend);
	}

	@Override
	public void removeFriend(String user, String friend) {
		// TODO Auto-generated method stub
		userManager.removeFriend(main, friend);
	}

	@Override
	public void acceptFriend(String user, String friend) {
		// TODO Auto-generated method stub
		userManager.acceptFriend(main, friend);
	}

	@Override
	public MemberDTO findUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> getFriends(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String username, String password) {
		return userManager.login(username, password);
	}

	@Override
	public byte[] play(String songname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SongDTO> getFavourites(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SongDTO> getPermanents(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SongDTO> getSongs() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
=======
		songManager.getSongs();
>>>>>>> 96d46ee32a918e8d61dd8b6339a1ebab168dc9eb
		return null;
	}

	@Override
	public void addFavourite(String user, String song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFavourite(String user, String song) {
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
	public void getPayments(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCurrentPayment(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(String user) {
		// TODO Auto-generated method stub
		
	}

	

}
