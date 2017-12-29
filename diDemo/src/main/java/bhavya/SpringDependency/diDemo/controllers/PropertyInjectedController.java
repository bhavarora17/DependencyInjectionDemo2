package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingServiceImpl;

/**
 * Created by barora on 12/29/2017.
 */
public class PropertyInjectedController {
	public GreetingServiceImpl greetingService;
	
	String sayHello(){
		return greetingService.sayGreeting();
	}
	

}
