package org.studyeasy.cars.specs;

import org.studyeasy.interfaces.Engine;

public class EngineType implements Engine {

	String type;

	public EngineType(String type) {
		this.type = type;
	}

	public EngineType() {
	   type="Unknown";
	}
	
	@Override
	public String type() {
		return type;
	}
	
	

}
