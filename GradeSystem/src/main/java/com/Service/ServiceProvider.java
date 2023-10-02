package com.Service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ServiceProvider {

	private static SessionFactory f;
	
	public static SessionFactory Service(){
		
		if(f==null) {
			f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
			System.out.println(f);
		}
		
		
		
		return f;
	}
	
	public void closefactory() {
		if(f.isOpen()) {
			f.close();
		}
	}
	
}
