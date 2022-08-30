package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component
public class Swift implements Car {

	public String specs() {
		
		return "Hi from swift";
	}

}
