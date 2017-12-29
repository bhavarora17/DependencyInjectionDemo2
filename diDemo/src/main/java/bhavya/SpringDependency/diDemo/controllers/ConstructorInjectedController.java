package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingService;

/**
 * Created by barora on 12/29/2017.
 */
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService  greetingService){
		this.greetingService = greetingService;
	}
	
	String sayHello(){
		return greetingService.sayGreeting();
	}
}
