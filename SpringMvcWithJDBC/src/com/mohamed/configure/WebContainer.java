package com.mohamed.configure;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebContainer implements WebApplicationInitializer{

	    @Override
	    public void onStartup(ServletContext container) {
	        AnnotationConfigWebApplicationContext context
	          = new AnnotationConfigWebApplicationContext();
	        context.setConfigLocation("com.mohamed.configure.SpringContainer");
	 
	        container.addListener(new ContextLoaderListener(context));
	 
	        ServletRegistration.Dynamic dispatcher = container
	          .addServlet("dispatcher", new DispatcherServlet(context));
	         
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	    }
	
	
	
	
	 

}
