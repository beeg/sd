package es.deusto.ingenieria.sd.tralala.server.data;

import java.util.List;

public abstract class Payment {

	protected int playNumber;
	protected double discount;
	protected List<PaymentMethod> paymentMethods;
	protected String memberName;

	public int getPlayNumber() {
		return playNumber;
	}

	public void setPlayNumber(int playNumber) {
		this.playNumber = playNumber;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
