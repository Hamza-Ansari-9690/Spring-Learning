package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Farari;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		Car swift =new Swift();
		Car farari =new Farari();
		
		System.out.println(swift.specs());
		System.out.println(farari.specs());
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Car myCar=context.getBean("farari",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
