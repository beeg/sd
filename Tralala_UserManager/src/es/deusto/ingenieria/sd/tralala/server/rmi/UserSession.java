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
		userManager.sendRecommendation(user, friend, songName);
	}

	@Override
	public void rejectRecommendation(String user, Recommendation recommendation) {
		// TODO Auto-generated method stub
		userManager.rejectRecommendation(user, recommendation);
	}

	@Override
	public void acceptRecommendation(String user, Recommendation recommendation) {
		// TODO Auto-generated method stub
		userManager.acceptRecommendation(user, recommendation);
	}

	@Override
	public void getRecommendations(String user) {
		// TODO Auto-generated method stub
		userManager.getRecommendations(user);
	}

	@Override
	public void addFriend(String user, String friend) {
		// TODO Auto-generated method stub
		userManager.addFriend(user, friend);
	}

	@Override
	public void removeFriend(String user, String friend) {
		// TODO Auto-generated method stub
		userManager.removeFriend(user, friend);
	}

	@Override
	public void acceptFriend(String user, String friend) {
		// TODO Auto-generated method stub
		userManager.acceptFriend(user, friend);
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
	public byte[] play(String songTitle) {
		// TODO Auto-generated method stub
		return this.songManager.play(songTitle);
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
		songManager.getSongs();
		return null;
	}

	@Override
	public void addFavourite(String user, String song) {
		// TODO Auto-generated method stub
		this.userManager.addFavourite(user, song);
		
	}

	@Override
	public void removeFavourite(String user, String song) {
		// TODO Auto-generated method stub
		this.userManager.removeFavourite(user, song);
	}

	@Override
	public void changePayment() {
		// TODO Auto-generated method stub
		this.userManager.changePayment();
	}

	@Override
	public void addPayment() {
		// TODO Auto-generated method stub
		this.userManager.addPayment();
	}

	@Override
	public void changePaymentType() {
		// TODO Auto-generated method stub
		this.userManager.changePaymentType();
	}

	@Override
	public void getPayments(String user) {
		// TODO Auto-generated method stub
		this.userManager.getPayments(user);
	}

	@Override
	public void getCurrentPayment(String user) {
		// TODO Auto-generated method stub
		this.userManager.getCurrentPayment(user);
	}

	@Override
	public void logout(String user) {
		// TODO Auto-generated method stub
		this.userManager.logout(user);
	}
}
