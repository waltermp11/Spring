package com.codigoWalter.Learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LearningApplication {
	private static Logger logger = LoggerFactory.getLogger(LearningApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);

		logger.info("This Applicaction is Running ✅");
		logger.debug("Mensaje Debugging");
		logger.error("Mensaje de Error");
		logger.warn("Mensaje de Warn");
		logger.trace("Mensaje de Trace ");
	}

}
