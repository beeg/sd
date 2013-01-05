package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.Remote;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Payment;
import es.deusto.ingenieria.sd.tralala.server.data.PaymentMethod;
import es.deusto.ingenieria.sd.tralala.server.data.dto.PaymentMethodDTO;

public interface IUserExpend extends Remote{

	public void changePayment(/*INSERT MEMBER*/ PaymentMethod newPayment);
	
	public List<PaymentMethodDTO> getPaymentMethods(/*INSERT MEMBER*/);
	
	public PaymentMethodDTO getCurrentPaymentMethod(/*INSERT MEMBER*/);
	
	public void addPaymentMethod(/*INSERT MEMBER*/ PaymentMethod newPayment);
	
	public Payment/*DTO*/ getPayments(/*INSERT MEMBER HERE*/);
	
	public void changePayment(/*INSERT MEMBER*/);
}
