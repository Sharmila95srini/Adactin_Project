package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_AP {
	
	
	static Logger log=Logger.getLogger(Logger_AP.class);
	
	public static void main(String[] args) {
		

		
		BasicConfigurator.configure();
		
		log.debug("debug");
		log.info("information");
		log.error("error");
		log.warn("warning");
		log.fatal("fatal");
		
		
		
		
		
	}
	

}
