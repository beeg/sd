package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;

public class CommonPayment extends Payment{
	
	public CommonPayment(int playNumber, ArrayList<PaymentMethod> paymentMethods,String memberName){
		this.playNumber = playNumber;
		this.paymentMethods=paymentMethods;
		this.memberName=memberName;	
	}
	
}
