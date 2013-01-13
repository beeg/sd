package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.ArrayList;

public class SpecialPayment extends Payment{

	double flatRate;
	double percentage;
	
	public SpecialPayment(int playNumber, ArrayList<PaymentMethod> paymentMethods, double flatRate, double percentage,double discount){
		this.playNumber = playNumber;
		this.paymentMethods = paymentMethods;
		this.flatRate = flatRate;
		this.percentage = percentage;
		this.discount=discount;
	}

	public double getFlatRate() {
		return flatRate;
	}

	public void setFlatRate(double flatRate) {
		this.flatRate = flatRate;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
	
}
