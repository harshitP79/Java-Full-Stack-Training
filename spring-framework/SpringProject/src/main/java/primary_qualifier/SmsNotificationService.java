package primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("smsService")
@Primary
public class SmsNotificationService implements NotificationService{
	@Override
	public void sendMsg(String message) {
		System.out.println("Sending Email via: "+message);
	}
}
