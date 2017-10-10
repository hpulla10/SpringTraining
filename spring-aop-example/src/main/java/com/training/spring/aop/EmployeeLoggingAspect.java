package com.training.spring.aop;

import org.aspectj.lang.JoinPoint;

public class EmployeeLoggingAspect {
	
	public void logAfter(JoinPoint joinpoint) {
		System.out.println("EmployeeLoggingAspect.logAfter() : "+ joinpoint.getSignature().getName());
	}
	
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("EmployeeLoggingAspect.logBefore() : "+ joinpoint.getSignature().getName());
	}
	
	

}
