package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Payment;
import es.deusto.ingenieria.sd.tralala.server.data.PaymentMethod;
import es.deusto.ingenieria.sd.tralala.server.data.dto.PaymentMethodDTO;

public class UserExpend extends UnicastRemoteObject implements IUserExpend{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5012655950947153450L;

	public UserExpend() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changePayment(PaymentMethod newPayment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PaymentMethodDTO> getPaymentMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentMethodDTO getCurrentPaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPaymentMethod(PaymentMethod newPayment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePayment() {
		// TODO Auto-generated method stub
		
	}

}
