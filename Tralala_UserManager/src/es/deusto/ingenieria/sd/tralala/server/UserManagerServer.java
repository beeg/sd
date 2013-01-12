package es.deusto.ingenieria.sd.tralala.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import es.deusto.ingenieria.sd.tralala.server.rmi.IUserSession;
import es.deusto.ingenieria.sd.tralala.server.rmi.UserSession;

public class UserManagerServer {

	public static void main(String[] args){
		if (args.length != 3) {
			System.exit(0);
		}

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];

		try {
			IUserSession facade = new UserSession();
			Naming.rebind(name, facade);
			System.out.println("- UserSession '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("$ TVProgramManager exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
