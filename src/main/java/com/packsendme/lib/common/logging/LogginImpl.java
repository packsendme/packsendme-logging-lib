package com.packsendme.lib.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class LogginImpl implements Loggin 
{
	private static final Logger logger = LoggerFactory.getLogger(LogginImpl.class);

	public void info(String msg) {
		logger.info(msg);
	}

	public void debug(String msg) {
		logger.debug(msg);
	}

	public void error(String msg) {
		logger.error(msg);
	}

	

}
