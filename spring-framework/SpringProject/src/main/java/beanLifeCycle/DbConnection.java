package beanLifeCycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DbConnection {
	public DbConnection() {
		System.out.println("DB constrcutor is been called!!");
		
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method is called!!");
	}
	
	
	public void executeQuery() {
		System.out.println("The query is being executed!!");
		System.out.println("Select * from STUDENTS;");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method is called before Object Destruction");
	}
}
