package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	sce.getServletContext().getAttribute("counter"); 
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
        System.out.println("Context Initialized");
        sce.getServletContext().getAttribute("counter");
    }
	
}
