package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Recommendation;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.RecommendationDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongFileDTO;
import es.deusto.ingenieria.sd.util.observer.remote.IRemoteObservable;
import es.deusto.ingenieria.sd.util.observer.remote.IRemoteObserver;

public interface IUserSession extends Remote{

	/* How are we sending members through the network? */
	
	public void sendRecommendation(MemberDTO user, MemberDTO friend, SongDTO song) throws RemoteException;
	
	public void rejectRecommendation(MemberDTO user, RecommendationDTO recommendation) throws RemoteException;
	
	public void acceptRecommendation(MemberDTO user, RecommendationDTO recommendation) throws RemoteException;
	
	public void getRecommendations(MemberDTO user) throws RemoteException;
	
	public void addFriend(MemberDTO user, MemberDTO friend) throws RemoteException;
	
	public void removeFriend(MemberDTO user, MemberDTO friend) throws RemoteException;
	
	public void acceptFriend(MemberDTO user, MemberDTO friend) throws RemoteException;
	
	public MemberDTO findUser(String username) throws RemoteException;
	
	public List<MemberDTO> getFriends(MemberDTO user) throws RemoteException;
	
	public MemberDTO login(String username, String password) throws RemoteException;
	
	//SongDTO to transfer it to the client, which is the reproducer?
	public SongFileDTO play(SongDTO song) throws RemoteException;
	
	public List<SongDTO> getFavourites(MemberDTO user) throws RemoteException;
	
	public List<SongDTO> getPermanents(MemberDTO user) throws RemoteException;
	
	public List<SongDTO> getSongs() throws RemoteException;
	
	public void addFavourite(MemberDTO user, SongDTO song) throws RemoteException;
	
	public void removeFavourite(MemberDTO user, SongDTO song) throws RemoteException;
	
	public void changePayment(/*ADD PAYMENTMETHODDTO HERE*/) throws RemoteException;
	
	public void addPayment(/*ADD PAYMENTMETHODDTO HERE*/) throws RemoteException;
	
	public void changePaymentType() throws RemoteException;
	
	public void /*DTO*/ getPayments(MemberDTO user) throws RemoteException;
	
	public void /*DTO*/ getCurrentPayment(MemberDTO user/*ADD PAYMENTMETHODDTO HERE*/) throws RemoteException;

	public void logout(MemberDTO user) throws RemoteException;
	
	public void addRemoteObserver(MemberDTO m, IRemoteObserver iro) throws RemoteException;
	
	public void deleteRemoteObserver(MemberDTO m) throws RemoteException;
}
