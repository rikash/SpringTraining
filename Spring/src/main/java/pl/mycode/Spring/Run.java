package pl.mycode.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.mycode.api.ISimpleInjection;
import pl.mycode.configuration.ContextConfig;
import pl.mycode.implementation.SimpleInjection;

public class Run {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ContextConfig.class);
		ISimpleInjection simpleInjection = ctx.getBean(SimpleInjection.class);
		simpleInjection.printHello();
	}

}
