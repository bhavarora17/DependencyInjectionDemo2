package bhavya.SpringDependency.diDemo.services;

import org.springframework.stereotype.Component;

/**
 * Created by barora on 1/2/2018.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{
	
	@Override
	public String getEnglishGreeting(){
		return "Hello - Primary Greting Service";
	}
	
	@Override
	public String getSpanishGreeting() {
		return "primary Spanish Greeting";
	}
	
	@Override
	public String getGermanGreeting() {
		return "Primary German Greeting";
	}
	
	
}
