package org.code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileManager {

	@PostConstruct
	void inicializador() {
		System.out.println("Me ejecuto durante la inicialización del bean");
	}
	
	@PreDestroy
	void destructor() {
		System.out.println("Me ejecuto durante la destrucción del bean");
	}
	
	String ejecucionDelBean( ) {
		return "Me estoy ejecutando";
	}
}
