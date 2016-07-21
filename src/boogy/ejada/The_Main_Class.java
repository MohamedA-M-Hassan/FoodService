package boogy.ejada;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import boogy.ejada.*;

public class The_Main_Class {

	public static void main(String[] args) {
		
		MH_User2 user = new MH_User2();
		user.setName("Mohaljgsndn");
		/*
		 MH_User2 []user = new MH_User2[3];
		
		user[1].setName("Mohamed Haaassan");
		user[2].setName("Amr Alaa");
		user[3].setName("Aya Emad");
		
		MH_Places []place = new MH_Places[3];
		place[1].setPlaceName("Gad");
		place[2].setPlaceName("MAC");
		place[3].setPlaceName("Anas");
		
		MH_Menu []item=new MH_Menu[5];
		item[1].setName("Foll");
		item[2].setName("T3MYA");
		item[3].setName("man2osha");
		item[4].setName("shaorma");
		item[5].setName("pepsi");
		
		*/
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
	/*
		for (int i =0 ; i < 3 ; i++ )
			{	
			session.save(user[i]);
			session.save(item[i]);
			session.save(place[i]);
			}
		*/
		session.getTransaction().commit();
		session.close();
	}

}
	