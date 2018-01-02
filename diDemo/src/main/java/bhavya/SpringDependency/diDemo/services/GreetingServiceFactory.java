package bhavya.SpringDependency.diDemo.services;

/**
 * Created by barora on 1/2/2018.
 */
public class GreetingServiceFactory {
	private GreetingRepositoryImpl greetingRepository;
	
	public GreetingServiceFactory(GreetingRepositoryImpl greetingRepository){
		//this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang){
		switch(lang){
			case "en":
				return new PrimaryGreetingService(greetingRepository);
				
			case "es":
				return new PrimarySpanishGreetingService(greetingRepository);
				
			case "de":
				return new PrimaryGermanGreetingService(greetingRepository);
				
			default:
				return new PrimaryGreetingService(greetingRepository);
		}
		
	}
}
