package bhavya.SpringDependency.diDemo;

import bhavya.SpringDependency.diDemo.controllers.MyController;
import bhavya.SpringDependency.diDemo.controllers.PropertyInjectedController;
import bhavya.SpringDependency.diDemo.examplebeans.FakeDataSource;
import bhavya.SpringDependency.diDemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"bhavya.SpringDependency"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller= (MyController)ctx.getBean("myController");
	//	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
	//	System.out.println(controller.hello());
		
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
	}
	
}
