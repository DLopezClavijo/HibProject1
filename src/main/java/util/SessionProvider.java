//package util;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
////Clase util para no tener que crear un archivo de configuracion xml
//public class SessionProvider {
//
//	private static Session session;
//	private static Configuration configuration;
//	
//	public SessionProvider() {		
//	}
//	
//	static {
//		configuration = new Configuration()
//				.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
//				.setProperty("hibernate.connection.driver.class", "com.mysql.jdbc.Driver")
//				.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/musicalhib")
//				.setProperty("hibernate.connection.username", "root")
//				.setProperty("hibernate.connection.password", "altair")
//				.setProperty("hibernate.show_sql", "true")
//				.addAnnotatedClass(bean.Album.class)
//				.addAnnotatedClass(bean.Artista.class)
//				.addAnnotatedClass(bean.Cancion.class);
////				.addAnnotatedClass(es.altair.bean.Sala.class);
//	}
//	
//	public static Session getSession() {
//		SessionFactory sf = configuration.buildSessionFactory();
//		session = sf.openSession();
//		return session;
//	}
//}
