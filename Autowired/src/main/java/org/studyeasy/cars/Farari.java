package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component
public class Farari implements Car {
	
	@Autowired
	@Qualifier("v6")
	Engine engine;
	
	
//	public void setEngine(Engine engine) {
//		engine.type="Zabardast Engine";
//		this.engine = engine;
//	}
	
//	public Farari(Engine engine) {
//		engine.type="Zabardast Engine";
//		this.engine = engine;
//	}

	public String specs() {
		 
		return "Hi from Farari   " +engine.type();
		
	}

}
