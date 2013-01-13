package es.deusto.ingenieria.sd.tralala.player.observer.remote;

import java.rmi.RemoteException;
import es.deusto.ingenieria.sd.tralala.player.controller.PlayerController;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.rmi.IUserSession;
import es.deusto.ingenieria.sd.util.observer.remote.RemoteObserver;

public class UserRemoteObserver extends RemoteObserver{
	
	private static final long serialVersionUID = 1L;
	private IUserSession userSession;	
	private PlayerController controller;
	
	public UserRemoteObserver(IUserSession useSs, PlayerController cont)throws RemoteException{
		userSession = useSs;
		controller = cont;
		userSession.addRemoteObserver(controller.getUser(), this);
	}
	
	public void end() {
		try{
			this.userSession.deleteRemoteObserver(controller.getUser());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void update(Object arg) {
		if(arg instanceof MemberDTO){
			this.controller.notifyNewUser((MemberDTO)arg);
		}
	}
}
