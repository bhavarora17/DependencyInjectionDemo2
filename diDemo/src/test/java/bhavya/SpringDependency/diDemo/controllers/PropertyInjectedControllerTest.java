package bhavya.SpringDependency.diDemo.controllers;

import bhavya.SpringDependency.diDemo2.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by barora on 12/29/2017.
 */
public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp()throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_BHAVYA, propertyInjectedController.sayHello());
	}
}
