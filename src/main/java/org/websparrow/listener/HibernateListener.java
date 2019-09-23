package org.websparrow.listener;

import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateListener implements ServletContextListener{
	private Configuration config;
	private SessionFactory factory;
	private static Class<HibernateListener> cls = HibernateListener.class;
	public static final String KEY_NAME = cls.getName();
	

	public void contextDestroyed(ServletContextEvent arg) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent arg) {
		try{
			URL url = HibernateListener.class.getResource("/hibernate.cfg.xml");
			config = new Configuration().configure(url);
			factory = config.buildSessionFactory();
			arg.getServletContext().setAttribute(KEY_NAME, factory);
		} catch(Exception e){
			e.printStackTrace();
		}		
	}
}
