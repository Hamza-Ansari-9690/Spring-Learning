package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.cars.Farari;
import org.studyeasy.cars.Swift;
import org.studyeasy.cars.specs.V6;
import org.studyeasy.cars.specs.V8;

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
	
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
	
	@Bean
	public V8 v8() {
		return new V8();
	}
}
