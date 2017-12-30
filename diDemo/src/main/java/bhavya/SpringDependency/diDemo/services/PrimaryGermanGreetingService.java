package bhavya.SpringDependency.diDemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by barora on 12/29/2017.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "German Service";
	}
}
