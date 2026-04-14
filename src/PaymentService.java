
public class PaymentService {
	
	private IPayment payment ;
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	public void Service(double amt) {
		
		boolean status = payment.doPayment(amt);
		if(status) {
			System.out.println("Printing bill . . .");
		}else {
			System.out.println("Payment Failed . . .");
		}
	}

}
