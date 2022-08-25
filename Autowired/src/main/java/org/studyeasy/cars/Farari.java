package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component
public class Farari implements Car {

	public String specs() {
		
		return "Hi from Farari";
	}

}
