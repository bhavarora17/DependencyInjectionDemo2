package bhavya.SpringDependency.diDemo2.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by barora on 12/29/2017.
 */

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		return "Spanish Service";
	}
}
