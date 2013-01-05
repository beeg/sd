package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.List;

public abstract class PaymentMethod {

	List<Payment> payments;

	public abstract void pay();
	
	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
}
