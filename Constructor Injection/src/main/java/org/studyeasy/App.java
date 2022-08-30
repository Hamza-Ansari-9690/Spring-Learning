package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Farari;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

public class App {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Car myCar=context.getBean("farari",Car.class);
		Engine myEngine=context.getBean("engineType",Engine.class);
		System.out.println(myCar.specs());
		System.out.println(myEngine.type());
		context.close();
	}

}
