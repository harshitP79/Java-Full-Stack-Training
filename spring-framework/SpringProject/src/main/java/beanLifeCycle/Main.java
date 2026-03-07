package beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
		
		System.out.println("Using bean!");
		DbConnection dbConnection = context.getBean(DbConnection.class);
		dbConnection.executeQuery();
		System.out.println("closing context");
		context.close();
		
	}
}
