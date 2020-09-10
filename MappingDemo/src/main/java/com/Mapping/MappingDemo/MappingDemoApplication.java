package com.Mapping.MappingDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemoApplication {

	public static void main(String[] args) {

		Model model = new Model();
		Modelemployee modelemployee = new Modelemployee();

		model.setName("Yash");
		model.setSurname("Chandel");
		model.setModelemployee(modelemployee);



		modelemployee.setEmpname("Shubham");
		modelemployee.setEmpsurname("Solanki");
		modelemployee.setModel(model);
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		org.hibernate.Session session = sessionFactory.openSession();

		session.beginTransaction();

	    session.save(model);

		session.save(modelemployee);
		
		session.getTransaction().commit();
		session.close();
          





	}

}
