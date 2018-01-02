package bhavya.SpringDependency.diDemo.services;

/**
 * Created by barora on 12/29/2017.
 */
public class PrimaryGermanGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return "German Service";
	}
}
