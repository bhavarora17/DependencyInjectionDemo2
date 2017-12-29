package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by barora on 12/29/2017.
 */

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService){
		this.greetingService = greetingService;
	}
	
	public String hello(){
		System.out.println("hello -----------------------------------------------------------------");
		
		return greetingService.sayGreeting();
	}
}
