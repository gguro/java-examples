package gguro.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gguro.common.Testable;

public class LoggerTest implements Testable{

	final static Logger logger = LogManager.getLogger(LoggerTest.class.getName());
			
	
	public void test() {
		String parameter = "test log message";
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}

}
