package database;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import models.User;
import models.Vaccine;

public class UserDb {

	public void storeUser(User user) {

		try {

			Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void removeUser(User user) {
		try {
			Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.delete(user);
			transaction.commit();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<User> fetchUserDatabase () {
		
		ArrayList <User> listOfUsers = new ArrayList<User>();
		try {
			Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Vaccine.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
		listOfUsers = (ArrayList<User>) session.createQuery("from Users").list();
			transaction.commit();
			return listOfUsers;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return listOfUsers;
	}
}
