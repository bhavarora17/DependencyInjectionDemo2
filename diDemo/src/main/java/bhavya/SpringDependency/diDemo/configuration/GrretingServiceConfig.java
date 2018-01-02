package bhavya.SpringDependency.diDemo.configuration;

import bhavya.SpringDependency.diDemo.services.GreetingRepositoryImpl;
import bhavya.SpringDependency.diDemo.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import bhavya.SpringDependency.diDemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by barora on 1/2/2018.
 */
@Configuration
public class GrretingServiceConfig {
	
	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepositoryImpl repository){
		return new GreetingServiceFactory(repository);
	}
	
	@Bean
	@Primary
	@Profile({"en","default"})
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("en");
	}
	
	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("de");
	}
	
	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("es");
	}
}
