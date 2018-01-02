package bhavya.SpringDependency.diDemo.services;

/**
 * Created by barora on 12/29/2017.
 */
public class PrimarySpanishGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;
	
	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	

	@Override
	public String sayGreeting() {
		return "Spanish Service";
	}
}
