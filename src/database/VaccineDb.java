package database;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import models.User;
import models.Vaccine;

public class VaccineDb {

	
	public void storeVaccine(Vaccine vaccine) {

		try {

			Configuration cfg = new Configuration().configure().addAnnotatedClass(Vaccine.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.save(vaccine);
			transaction.commit();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void removeVaccine(Vaccine vaccine) {
		try {
			Configuration cfg = new Configuration().configure().addAnnotatedClass(Vaccine.class);;
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			session.delete(vaccine);
			transaction.commit();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Vaccine> fetchVaccineDatabase () {
		
		ArrayList <Vaccine> listOfVaccines = new ArrayList<Vaccine>();
		try {
			Configuration cfg = new Configuration().configure().addAnnotatedClass(Vaccine.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			listOfVaccines = (ArrayList<Vaccine>) session.createQuery("from Vaccine").list();
			transaction.commit();
			return listOfVaccines;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return listOfVaccines;
	}
	
	
	@SuppressWarnings("unchecked")
	public int generateVaccineId () {
		
		ArrayList <Vaccine> listOfVaccines = new ArrayList<Vaccine>();
		try {
			Configuration cfg = new Configuration().configure().addAnnotatedClass(Vaccine.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();
			listOfVaccines = (ArrayList<Vaccine>) session.createQuery("from Vaccine order by vaccine_ID desc").list();
			transaction.commit();
			return listOfVaccines.get(0).getVaccineId();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
}
