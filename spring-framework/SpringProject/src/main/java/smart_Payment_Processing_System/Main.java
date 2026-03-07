package smart_Payment_Processing_System;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentProcessor processor= context.getBean(PaymentProcessor.class);
		processor.makePayment(2500);
		context.close();
	
	}
}
