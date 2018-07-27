package com.packsendme.lib.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogginExecution {

	private static final Logger logger = LoggerFactory.getLogger(LogginExecution.class);

	public static void main( String[] args )
    {
		LogginImpl log = new LogginImpl();
		log.info(" R I C A");
		//logger.info("INF");
        System.out.println( "Hello World!" );
    }
}
