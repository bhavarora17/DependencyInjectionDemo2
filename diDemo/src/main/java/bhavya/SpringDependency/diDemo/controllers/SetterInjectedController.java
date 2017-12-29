package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo.services.GreetingService;
import bhavya.SpringDependency.diDemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by barora on 12/29/2017.
 */
@Controller
public class SetterInjectedController {
	private GreetingService greetingService;
	
	String sayHello(){
		return greetingService.sayGreeting();
	}
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService greetingService){
		this.greetingService = greetingService;
	}
}
