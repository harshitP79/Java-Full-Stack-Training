package primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManger {
	
	private final NotificationService primaryService;
	private final NotificationService emailService;
	private final NotificationService pushService;
	
//	@Autowired
//	public  NotificationManger(@Qualifier("SMSNotification") NotificationService primaryService,@Qualifier("emailNotificationService") NotificationService emailService,@Qualifier("pushNotification") NotificationService pushService) 
//	{
//			
//		this.primaryService=primaryService;
//		this.emailService=emailService;
//		this.pushService=pushService;
//		
//	}
	
	@Autowired
	public NotificationManger(NotificationService primaryService, @Qualifier("emailService") NotificationService emailService, @Qualifier("pushService") NotificationService pushService) {
		this.primaryService = primaryService;
		this.emailService=emailService;
		this.pushService=pushService;
	}
	
//	public void sendEmail() {
//  emailService.sendMsg();
//}
//
//public void sendPushNotification() {
//	pushService.sendMsg();
//}
//
//public void sendSms() {
//	primaryService.sendMsg();
//}
	
	public void sendNotification() {
		System.out.println("--- @Primary (SMS)");
		primaryService.sendMsg("Hello Via Primary");
	}
	
	public void sendEmailNotification() {
		System.out.println("--- @Email Service ---");
		emailService.sendMsg("Hello via Email Service");
	}
	
	public void sendPushNotification() {
		System.out.println("--- @Push Notification Service ---");
		pushService.sendMsg("Hello via Push Service");
	}
}
