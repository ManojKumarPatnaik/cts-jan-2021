package com.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {
	private static Logger logger = LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args) {
		logger.info("This is main method inside info");
		logger.warn("This is main method inside warn");
		logger.error("This is main method inside error");
		logger.debug("This is main method inside debug");
		int a = 10;
		int b = 0;
		try {
			int result = a/b;
			logger.debug("result {}", result);
		} catch(Exception e) {
			logger.error(e.getMessage(), e);
			
		}
	}
	
	
}
