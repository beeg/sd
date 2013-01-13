package es.deusto.ingenieria.sd.tralala.server.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import es.deusto.ingenieria.sd.tralala.server.rmi.IUserExpend;
import es.deusto.ingenieria.sd.tralala.server.rmi.UserExpend;

public class PaymentManagerServer {
	public static void main(String[] args){
		if (args.length != 3) {
			System.exit(0);
		}

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];

		try {
			IUserExpend facade = new UserExpend();
			Naming.rebind(name, facade);
			System.out.println("- PaymentManagerServer'" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("$ PaymaentManager exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
