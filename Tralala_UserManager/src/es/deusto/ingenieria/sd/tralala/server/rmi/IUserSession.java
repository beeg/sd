package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongFileDTO;

public interface IUserSession extends Remote{

	/* How are we sending members through the network? */
	
	public void sendRecommendation(String user, String friend, String songName) throws RemoteException;
	
	public void rejectRecommendation(String user, Recommendation recommendation) throws RemoteException;
	
	public void acceptRecommendation(String user, Recommendation recommendation) throws RemoteException;
	
	public void getRecommendations(String user) throws RemoteException;
	
	public void addFriend(String user, String friend) throws RemoteException;
	
	public void removeFriend(String user, String friend) throws RemoteException;
	
	public void acceptFriend(String user, String friend) throws RemoteException;
	
	public MemberDTO findUser(String username) throws RemoteException;
	
	public List<MemberDTO> getFriends(String user) throws RemoteException;
	
	public MemberDTO login(String username, String password) throws RemoteException;
	
	//SongDTO to transfer it to the client, which is the reproducer?
	public SongFileDTO play(String songname) throws RemoteException;
	
	public List<SongDTO> getFavourites(String user) throws RemoteException;
	
	public List<SongDTO> getPermanents(String user) throws RemoteException;
	
	public List<SongDTO> getSongs() throws RemoteException;
	
	public void addFavourite(String user, String song) throws RemoteException;
	
	public void removeFavourite(String user, String song) throws RemoteException;
	
	public void changePayment(/*ADD PAYMENTMETHODDTO HERE*/) throws RemoteException;
	
	public void addPayment(/*ADD PAYMENTMETHODDTO HERE*/) throws RemoteException;
	
	public void changePaymentType() throws RemoteException;
	
	public void /*DTO*/ getPayments(String user) throws RemoteException;
	
	public void /*DTO*/ getCurrentPayment(String user/*ADD PAYMENTMETHODDTO HERE*/) throws RemoteException;

	public void logout(String user) throws RemoteException;
}
