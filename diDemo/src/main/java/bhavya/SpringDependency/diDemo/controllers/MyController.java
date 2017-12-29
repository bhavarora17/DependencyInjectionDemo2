package bhavya.SpringDependency.diDemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by barora on 12/29/2017.
 */

@Controller
public class MyController {
	public String hello(){
		System.out.println("hello -----------------------------------------------------------------");
		
		return "foo";
	}
}
