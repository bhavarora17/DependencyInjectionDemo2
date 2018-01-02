package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by barora on 12/29/2017.
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingService greetingService;// the name tells the bean to be injected, but see if the primary takes over
	
	public String sayHello(){
		return greetingService.sayGreeting();
	}
	
}
