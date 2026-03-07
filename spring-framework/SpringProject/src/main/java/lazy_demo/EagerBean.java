package lazy_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class EagerBean {
	public EagerBean() {
		System.out.println("Eager Bean Created!!");
	}
	
	public void start() {
		System.out.println("Bean has been Started!");
	}
}
 