package com.tyss;

public class MessageService {
	private EmailService emailService;
	
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	public void sendMessage() {
		System.out.println("Message is being sent!!");
		emailService.send();
	}
}
