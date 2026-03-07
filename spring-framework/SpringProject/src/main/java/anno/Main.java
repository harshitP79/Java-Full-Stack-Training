package anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import anno.MessageService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		MessageService messageService = context.getBean(MessageService.class);
		messageService.sendMessage();
		context.close();
	}
}
