package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by barora on 12/29/2017.
 */
@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService  greetingService){
		this.greetingService = greetingService;
	}
	
	String sayHello(){
		return greetingService.sayGreeting();
	}
}
