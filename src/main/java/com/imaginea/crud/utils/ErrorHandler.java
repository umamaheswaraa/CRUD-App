package com.imaginea.crud.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imaginea.crud.exception.CRUDException;


@Aspect
public class ErrorHandler {

	private Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
	
	@AfterThrowing(pointcut = "within(com.imaginea.crud.service..*)", throwing="throwable")
	public void processException(JoinPoint joinPoint, Throwable throwable)
	{
		try{
			logger.error("logging to test Point cut"+throwable.getMessage());
			if(throwable instanceof CRUDException){
					logger.error("Failed Due to :"+throwable.getLocalizedMessage());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
