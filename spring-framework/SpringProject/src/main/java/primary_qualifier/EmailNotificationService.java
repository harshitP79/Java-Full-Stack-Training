package primary_qualifier;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service("emailService")
public class EmailNotificationService implements NotificationService{
	@Override
	public void sendMsg(String message) {
		System.out.println("Sending message via: "+message);
	}
}
