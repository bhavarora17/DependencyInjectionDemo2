package bhavya.SpringDependency.diDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by barora on 12/29/2017.
 */
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	
	public LifeCycleDemoBean() {
		System.out.println("I am in the Life Cycle Bean Demo");
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("PostC Construct !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Pre Destroy !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public void beforeInit(){
		System.out.println("Post processor calling before Init !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public void afterInit(){
		System.out.println("Post Processor Calling after Init !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	
	}
	
	@Override
	public void setBeanName(String s) {
	
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("properties has been set");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	
	}
}
