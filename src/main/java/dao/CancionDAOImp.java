package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Cancion;

public class CancionDAOImp implements CancionDAO {

	public void save(Cancion c) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion = sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(c);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			
		}finally {
			sesion.close();
			sf.close();
		}

	}

}
