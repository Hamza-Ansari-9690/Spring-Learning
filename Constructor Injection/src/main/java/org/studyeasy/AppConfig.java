package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.cars.Farari;
import org.studyeasy.cars.Swift;
import org.studyeasy.cars.specs.EngineType;


@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {
		
	@Bean
	public Farari farari() {
		return new Farari();
	}
	
	@Bean
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V6 Engine");
	}
	
}
