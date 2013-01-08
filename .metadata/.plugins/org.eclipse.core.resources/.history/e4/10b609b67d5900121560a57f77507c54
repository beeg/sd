package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import es.deusto.ingenieria.sd.tralala.server.SongService;
import es.deusto.ingenieria.sd.tralala.server.UserService;
import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
<<<<<<< HEAD
import es.deusto.ingenieria.sd.tralala.server.data.Song;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberAssembler;
=======
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
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
<<<<<<< HEAD
		//userManager.sendRecommendation(main, receiver, song);
=======
		userManager.sendRecommendation(user, friend, songName);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public void rejectRecommendation(String user, Recommendation recommendation) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//userManager.rejectRecommendation(main, recommendation);
=======
		userManager.rejectRecommendation(user, recommendation);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public void acceptRecommendation(String user, Recommendation recommendation) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//userManager.acceptRecommendation(main, recommendation);
=======
		userManager.acceptRecommendation(user, recommendation);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public void getRecommendations(String user) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//userManager.getRecommendations(main);
=======
		userManager.getRecommendations(user);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public void addFriend(String user, String friend) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//userManager.addFriend(main, friend);
=======
		userManager.addFriend(user, friend);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public void removeFriend(String user, String friend) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//userManager.removeFriend(main, friend);
=======
		userManager.removeFriend(user, friend);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public void acceptFriend(String user, String friend) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//userManager.acceptFriend(main, friend);
=======
		userManager.acceptFriend(user, friend);
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
	}

	@Override
	public MemberDTO findUser(String username) {
		// TODO Auto-generated method stub
		return MemberAssembler.assemble(userManager.findUser(username));
	}

	@Override
	public List<MemberDTO> getFriends(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO login(String username, String password) {		
		return MemberAssembler.assemble(userManager.login(username, password));
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
<<<<<<< HEAD
=======
		return null;
>>>>>>> e842192ef2510baa67fe3d7506383908dc8f1783
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
