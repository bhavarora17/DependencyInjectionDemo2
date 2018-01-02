package bhavya.SpringDependency.diDemo2.services;

import org.springframework.stereotype.Service;

/**
 * Created by barora on 12/29/2017.
 */
@Service
public class GreetingServiceImpl implements GreetingService{
	
	public static final String HELLO_BHAVYA	= "Hello Bhavya";

	@Override
	public String sayGreeting() {
		return HELLO_BHAVYA;
	}
}
