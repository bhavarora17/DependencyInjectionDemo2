package bhavya.SpringDependency.diDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by barora on 12/29/2017.
 */
@Component
public class CustomBeanPostProcesor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {
		
		if(bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).beforeInit();
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {
		
		if(bean instanceof LifeCycleDemoBean){
			((LifeCycleDemoBean)bean).afterInit();
		}
		return bean;
	}
}
