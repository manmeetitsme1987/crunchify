package com.crunchify.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProfider implements ApplicationContextAware {
	private static ApplicationContext ctx;
	
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		ApplicationContextProfider.ctx = arg0;

	}
	
	public static ApplicationContext get(){
		return ctx;
	}

}
