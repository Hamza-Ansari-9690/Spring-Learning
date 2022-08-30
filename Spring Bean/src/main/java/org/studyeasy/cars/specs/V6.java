package org.studyeasy.cars.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;

public class V6 implements Engine {

	@Override
	public String type() {
		
		return "V6 Engine";
	}

}
