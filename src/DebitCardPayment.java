
public class DebitCardPayment implements IPayment{
	
	@Override
	public Boolean doPayment(double amt) {
		System.out.println("Debit Card Payment Successful !!!");		
	return true;
	}
	
}
