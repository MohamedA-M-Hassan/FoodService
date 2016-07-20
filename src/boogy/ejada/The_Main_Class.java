package boogy.ejada;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import boogy.ejada.MH_User2;

public class The_Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MH_User2 user = new MH_User2();
		user.setName("Mohamed Hassan");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
	}

}
