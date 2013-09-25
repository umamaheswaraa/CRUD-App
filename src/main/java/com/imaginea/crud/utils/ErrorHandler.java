package com.imaginea.crud.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class ErrorHandler {

	private Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
	
	@AfterThrowing(pointcut = "within(com.imaginea.crud.service..*)", throwing="throwable")
	public void processException(JoinPoint joinPoint, Throwable throwable)
	{
		try{
			logger.error("logging to test Point cut"+throwable.getMessage());
			//To Add Business Logic
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
