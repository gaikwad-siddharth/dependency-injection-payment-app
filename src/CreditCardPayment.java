
public class CreditCardPayment implements IPayment{
	
	@Override
	public Boolean doPayment(double amt) {
		System.out.println("Credit Card Payment Successful !!!");
		return true;
	}

}
