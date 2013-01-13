package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;

public class PayPal extends PaymentMethod{

	String nick;
	String pass;
	
	public PayPal(String nick, String pass, Payment payment) {
		super();
		this.nick = nick;
		this.pass = pass;
		this.payment = payment;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
	
}
