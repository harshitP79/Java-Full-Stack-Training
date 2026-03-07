package anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import anno.EmailService;

@Component
public class MessageService {
	@Autowired
private EmailService emailService;
	
	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	

	public MessageService(EmailService emailService) {
		this.emailService = emailService;
	}


	public void sendMessage() {
		System.out.println("Message is being sent!!");
		emailService.send();
	}
}
	