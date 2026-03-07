package smart_Payment_Processing_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
		private PaymentService paymentService;
		
		@Autowired
		private TransactionLogger transactionLogger;
		
		public PaymentProcessor(@Qualifier("Myexo") PaymentService paymentService) {
			this.paymentService=paymentService;
		}
		
		public void makePayment(double amount) {
			System.out.println("Payment Initiated!");
			paymentService.processPayment(amount);
			transactionLogger.log("Transaction comoleted for: "+amount);
		}
}
