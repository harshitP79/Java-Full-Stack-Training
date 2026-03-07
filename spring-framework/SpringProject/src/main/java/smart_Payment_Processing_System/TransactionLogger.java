package smart_Payment_Processing_System;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TransactionLogger {
	public TransactionLogger() {
		System.out.println("Transaction Logger bean created.");
	}
	
	@PostConstruct
    public void init() {
        System.out.println("Logger initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Logger destroyed");
    }
    
    public void log(String s) {
    	System.out.println("LOG: "+ s);
    }
}
