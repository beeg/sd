package es.deusto.ingenieria.sd.tralala.player.controller;

import java.rmi.RemoteException;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import es.deusto.ingenieria.sd.tralala.player.gui.MainWindow;
import es.deusto.ingenieria.sd.tralala.player.remote.ServiceLocator;
import es.deusto.ingenieria.sd.tralala.server.data.dto.MemberDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongDTO;
import es.deusto.ingenieria.sd.tralala.server.data.dto.SongFileDTO;

public class PlayerController {

	private MemberDTO user;
	private ServiceLocator sLocator;
	private SoundPlayer player;
	
	public PlayerController(String ip, String port, String serviceName){
		sLocator = new ServiceLocator();
		sLocator.setService(ip, port, serviceName);
		System.out.println(sLocator.getService().getClass());
		player = SoundPlayer.getInstance();
		new MainWindow(this);
	}
	
	public List<SongDTO> getSongs() throws RemoteException{
		return sLocator.getService().getSongs();
	}
	
	public boolean login(String username, String password) throws RemoteException{
		user = sLocator.getService().login(username, password);
		return (user != null);
	}
	
	public List<SongDTO> getFavourites() throws RemoteException{
		return sLocator.getService().getFavourites(user.getUser());
	}
	
	public String play(String songname) throws RemoteException{
		SongFileDTO sourceFile = sLocator.getService().play(songname);
		System.out.println(sourceFile);
		player.playSong(sourceFile.getData(), sourceFile.getFormat().getAudioFormat());
		return sourceFile.getLyrics();
	}
	
	public List<SongDTO> getPermanents() throws RemoteException{
		return sLocator.getService().getPermanents(user.getUser());
	}
	
	public List<MemberDTO> getFriends() throws RemoteException{
		return sLocator.getService().getFriends(user.getUser());
	}
	
	public void logout(){
		user = null;
	}
	
	public static void main(String [] args){
        try {
        	for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        		if ("Nimbus".equals(info.getName())) {
        			UIManager.setLookAndFeel(info.getClassName());
        			break;
        		}
        	}
        } catch (Exception e){
                
        } finally {
    		new PlayerController(args[0], args[1], args[2]);
        }
	}
}
