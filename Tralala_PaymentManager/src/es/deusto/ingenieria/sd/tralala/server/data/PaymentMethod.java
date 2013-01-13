package es.deusto.ingenieria.sd.tralala.server.data;

public abstract class PaymentMethod {

	Payment payment;

	public abstract void pay();

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
