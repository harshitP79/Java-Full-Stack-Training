package smart_Payment_Processing_System;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Primary
public class CreditCardPayment implements PaymentService{
	public CreditCardPayment() {
		System.out.println("Credit card bean Created!");
	}
	@Override
	public void processPayment(double Amount) {
		System.out.println("Credit Card Payment of: "+ Amount+" completed.");
	}
	
}
