package bhavya.SpringDependency.diDemo.configuration;

import bhavya.SpringDependency.diDemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by barora on 1/4/2018.
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${bhavya.username}")
	String user;
	
	@Value("${bhavya.password}")
	String password;
	
	@Value("${bhavya.dburl}")
	String url;
	
	@Bean
	public FakeDataSource fakeDataSource(){
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties(){
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
