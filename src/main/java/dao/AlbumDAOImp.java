package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Album;

public class AlbumDAOImp implements AlbumDAO {

	public void save(Album a) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion = sf.openSession();

		try {
			sesion.beginTransaction();
			sesion.save(a);
			sesion.getTransaction().commit();
			
		}catch (Exception e){	
		} finally {
			sesion.close();
			sf.close();
		}
	}

}
