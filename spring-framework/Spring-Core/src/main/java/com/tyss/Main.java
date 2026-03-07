package com.tyss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	MessageService messageService = context.getBean(MessageService.class);
	
	
}
