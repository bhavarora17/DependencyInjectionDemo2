package bhavya.SpringDependency.diDemo.services;

/**
 * Created by barora on 12/29/2017.
 */
public class PrimaryGreetingService implements GreetingService{
	
	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingService(GreetingRepository greetingRepository){
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return "Primary Greeting";
	}
}
