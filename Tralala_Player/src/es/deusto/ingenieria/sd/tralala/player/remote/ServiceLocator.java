package es.deusto.ingenieria.sd.tralala.player.remote;

import java.rmi.Naming;

import es.deusto.ingenieria.sd.tralala.server.rmi.IUserSession;

public class ServiceLocator {
	
	private IUserSession service;

    public ServiceLocator(){ 
    
    }

    public void setService(String ip, String port, String serviceName) {    
    	// Add your code to get the TARGET reference HERE    	
    	try {
    		String name = "//" + ip + ":" + port + "/" + serviceName;
    		service = (IUserSession) Naming.lookup(name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public IUserSession getService() {
    	return service;
    }
	
}
