package bhavya.SpringDependency.diDemo;

import bhavya.SpringDependency.diDemo.controllers.MyController;
import bhavya.SpringDependency.diDemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
	//	MyController controller= (MyController)ctx.getBean("myController");
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
	//	System.out.println(controller.hello());
	}
	
}
