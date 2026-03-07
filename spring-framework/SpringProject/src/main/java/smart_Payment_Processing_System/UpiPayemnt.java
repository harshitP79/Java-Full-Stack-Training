package smart_Payment_Processing_System;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Myexo")
@Scope("prototype")
public class UpiPayemnt implements PaymentService{
	public UpiPayemnt() {
		System.out.println("UPI Payment bean created!");
	}

	@Override
	public void processPayment(double Amount) {
		System.out.println("UPI Payment of: "+ Amount+" completed.");
	}
	
}
