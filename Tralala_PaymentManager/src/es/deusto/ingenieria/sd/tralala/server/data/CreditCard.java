package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;

public class CreditCard extends PaymentMethod{

	String number;
	String ccv;
	public CreditCard(String number, String ccv) {
		super();
		this.number = number;
		this.ccv = ccv;
		this.payments = new ArrayList<Payment>();
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getCcv() {
		return ccv;
	}
	
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
		
}
