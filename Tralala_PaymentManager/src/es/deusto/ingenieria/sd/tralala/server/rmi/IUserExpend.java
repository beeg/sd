package es.deusto.ingenieria.sd.tralala.server.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.tralala.server.data.Payment;
import es.deusto.ingenieria.sd.tralala.server.data.PaymentMethod;
import es.deusto.ingenieria.sd.tralala.server.data.dto.PaymentMethodDTO;

public interface IUserExpend extends Remote{

	public void changePayment(/*INSERT MEMBER*/ PaymentMethod newPayment) throws RemoteException;
	
	public List<PaymentMethodDTO> getPaymentMethods(/*INSERT MEMBER*/) throws RemoteException;
	
	public PaymentMethodDTO getCurrentPaymentMethod(/*INSERT MEMBER*/) throws RemoteException;
	
	public void addPaymentMethod(/*INSERT MEMBER*/ PaymentMethod newPayment) throws RemoteException;
	
	public Payment/*DTO*/ getPayments(/*INSERT MEMBER HERE*/) throws RemoteException;
	
	public void changePayment(/*INSERT MEMBER*/) throws RemoteException;
}
