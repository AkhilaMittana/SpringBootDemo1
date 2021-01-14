package com;

import org.apache.log4j.*;

public class Demo {

	static Logger log=Logger.getLogger(Demo.class.getName());
	public static void main(String args[]) throws Exception
	{
		//PropertiesConfigurator.configure("Properties/log4j.properties");
		log.debug("This is debug information");
		log.info("Program execution in normal process");
		System.out.println("Program execution is over");
		
	}	

	}


