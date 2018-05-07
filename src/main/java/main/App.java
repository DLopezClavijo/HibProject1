package main;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.mapping.List;

import bean.Album;
import bean.Artista;
import bean.Cancion;
import dao.AlbumDAO;
import dao.AlbumDAOImp;
import dao.ArtistaDAO;
import dao.ArtistaDAOImp;
import dao.CancionDAO;
import dao.CancionDAOImp;

public class App 
{	
	private static ArtistaDAO aDAO = new ArtistaDAOImp();
	private static AlbumDAO albDAO = new AlbumDAOImp();
	private static CancionDAO cDAO = new CancionDAOImp();
    
    
    public static void main( String[] args )
    {

        Artista a1 = new Artista("Paco");
        Artista a2 = new Artista("Manu");
        
        Set<Album> recop = new HashSet<Album>();
        recop.add(new Album("A1primer", a2));
        recop.add(new Album("A1segundo", a2));
        recop.add(new Album("A1tercero", a2));
        recop.add(new Album("A1cuarto", a2));
       
		a2.setAlbumes(recop);
		
		aDAO.save(a2);
	
       System.out.println("\t\t\t\t╔═════════════════════════════════════════════════╗");
       System.out.println("\t\t\t\t║                         MENU                    ║");
       System.out.println("\t\t\t\t╠═════════════════════════════════════════════════╣");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    1.- Añadir Cantante                          ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    2.- Añadir Cancion                           ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    3.- Añadir Estilo                            ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    4.- Listar Cantante Segun Estilo             ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    5.- Lista Canciones de un Cantante           ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    6.- Actualizar edad de un Cantante           ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    7.- Borrar Todas las canciones de un Cantante║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║    8.- Mostrar Cantante y Canciones             ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t║                  0) Salir                       ║");
       System.out.println("\t\t\t\t║                                                 ║");
       System.out.println("\t\t\t\t╚═════════════════════════════════════════════════╝");
       
    };
       
       
//      Cancion c1 = new Cancion(nombre, duracion, album)
//       Cancion c2 = new Cancion("Cancion2", 200, alb1);
//       Cancion c3 = new Cancion("Cancion3", 210, alb1);
//       
 //     cDAO.save(c1);
       
}
