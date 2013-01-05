package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.Date;

public abstract class Payment {

	Date date;
	int playNumber;
	PaymentMethod method;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPlayNumber() {
		return playNumber;
	}

	public void setPlayNumber(int playNumber) {
		this.playNumber = playNumber;
	}

	public PaymentMethod getMethod() {
		return method;
	}

	public void setMethod(PaymentMethod method) {
		this.method = method;
	}

	public abstract double amountPaid();
}
