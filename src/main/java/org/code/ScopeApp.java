package org.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FileManager fileManager = context.getBean("fileManager",FileManager.class);
		System.out.println(fileManager.ejecucionDelBean());
		context.close();
	}

}
