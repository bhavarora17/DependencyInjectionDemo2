package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingService;
import bhavya.SpringDependency.diDemo.services.GreetingServiceImpl;

/**
 * Created by barora on 12/29/2017.
 */
public class SetterInjectedController {
	private GreetingService greetingService;
	
	String sayHello(){
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingService greetingService){
		this.greetingService = greetingService;
	}
}
