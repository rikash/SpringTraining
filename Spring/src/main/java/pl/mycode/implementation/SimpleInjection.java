package pl.mycode.implementation;

import org.springframework.stereotype.Component;

import pl.mycode.api.ISimpleInjection;

@Component
public class SimpleInjection implements ISimpleInjection{
	
	public SimpleInjection(){
		
	}

	public void printHello() {
		System.out.println("Injection working!");
	}

}
