package com.crunchify.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crunchify.util.ApplicationContextProfider;

@Controller
public class CrunchifyHelloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		 
		ApplicationContext ctx = ApplicationContextProfider.get();
		MainApp.databaseOperations(ctx);
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}