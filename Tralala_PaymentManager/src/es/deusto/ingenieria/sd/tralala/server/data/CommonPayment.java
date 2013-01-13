package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.Date;

public class CommonPayment extends Payment{
	
	public CommonPayment(Date date, int playNumber, PaymentMethod method){
		this.date = date;
		this.playNumber = playNumber;
		this.method = method;
	}

	@Override
	public double amountPaid() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
