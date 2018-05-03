package main;



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
    public static void main( String[] args )
    {
       ArtistaDAO aDAO = new ArtistaDAOImp();
       AlbumDAO albDAO = new AlbumDAOImp();
//       CancionDAO cDAO = new CancionDAOImp();
       
       Artista a1 = new Artista("Paco");
       Artista a2 = new Artista("Manu");
       
       Album alb1 = new Album("Hola", a1);
       Album alb2 = new Album("Album2", a2);
       
       
       
//      Cancion c1 = new Cancion(nombre, duracion, album)
//       Cancion c2 = new Cancion("Cancion2", 200, alb1);
//       Cancion c3 = new Cancion("Cancion3", 210, alb1);
//       
 //     cDAO.save(c1);
       
    }
}
