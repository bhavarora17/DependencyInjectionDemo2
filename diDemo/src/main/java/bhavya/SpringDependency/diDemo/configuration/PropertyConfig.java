package bhavya.SpringDependency.diDemo.configuration;

import bhavya.SpringDependency.diDemo.examplebeans.FakeDataSource;
import bhavya.SpringDependency.diDemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by barora on 1/4/2018.
 */
@Configuration
//@PropertySource({"classpath:jms.properties", "classpath:datasource.properties" })//switching the properties files switches the order of use.
public class PropertyConfig {

	@Autowired
	Environment env;
	
	@Value("${bhavya.username}")
	String user;
	
	@Value("${bhavya.password}")
	String password;
	
	@Value("${bhavya.dburl}")
	String url;
	
	@Value("${bhavya.jms.username}")
	String jmsuser;
	
	@Value("${bhavya.jms.password}")
	String jmspassword;
	
	@Value("${bhavya.jms.dburl}")
	String jmsurl;
	
	@Bean
	public FakeDataSource fakeDataSource(){
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("USERNAME"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker(){
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUsername(jmsuser);
		fakeJmsBroker.setPassword(jmspassword);
		fakeJmsBroker.setUrl(jmsurl);
		
		return fakeJmsBroker;
	}
}
