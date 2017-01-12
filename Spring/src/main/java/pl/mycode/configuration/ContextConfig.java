package pl.mycode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.mycode.api.ISimpleInjection;
import pl.mycode.implementation.SimpleInjection;

@Configuration
@ComponentScan(basePackages="pl.mycode.implementation")
public class ContextConfig {
	
	@Bean 
	public ISimpleInjection simpleInjection(){
		return new SimpleInjection();
	}

}
