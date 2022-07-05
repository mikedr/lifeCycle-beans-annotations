package org.code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileManager {

	@PostConstruct
	void inicializador() {
		System.out.println("Me ejecuto durante la inicializaci�n del bean");
	}
	
	@PreDestroy
	void destructor() {
		System.out.println("Me ejecuto durante la destrucci�n del bean");
	}
	
	String ejecucionDelBean( ) {
		return "Me estoy ejecutando";
	}
}
