
public class App {

	public static void main(String[] args) {
		
		IPayment p = new DebitCardPayment();
		PaymentService service = new PaymentService(p);
	service.Service(500.00);
	}

}
