package info.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public enum HibernateUtil {
	INSTANCE;
	private SessionFactory sessionFactory = null;
	private HibernateUtil() {
		Configuration cfg = new Configuration();
		cfg.configure();
		Properties props = cfg.getProperties();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(props).buildServiceRegistry();
		sessionFactory = cfg.buildSessionFactory(sr);
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	

}
