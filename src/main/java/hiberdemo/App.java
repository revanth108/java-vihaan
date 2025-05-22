package hiberdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Users.class)
									.buildSessionFactory();
		//Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		try {
			//create object of entity class
			Users user = new Users("abcc","passs","abbc@gmail.com");
			//start transaction
			session.beginTransaction();
			//perform transaction
			session.save(user);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("row added");
			
			}
		finally {
			session.close();
			factory.close();
		}

	}

}
