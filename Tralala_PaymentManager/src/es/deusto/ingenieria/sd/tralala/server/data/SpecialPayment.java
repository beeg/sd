package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.Date;

public class SpecialPayment extends Payment{

	double flatRate;
	double percentage;
	
	public SpecialPayment(Date date, int playNumber, PaymentMethod method, double flatRate, double percentage){
		this.date = date;
		this.playNumber = playNumber;
		this.method = method;
		this.flatRate = flatRate;
		this.percentage = percentage;
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

	@Override
	public double amountPaid() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
