package bean;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="cancion")
public class Cancion implements Serializable{
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int idCancion;
 private String nombre;
 private int duracion;
// @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int idX;


@ManyToOne
 @JoinColumn(name="idAlbum")
 private Album idAlbum;
 
 
public Album getIdAlbum() {
	return idAlbum;
}
public void setIdAlbum(Album album) {
	this.idAlbum = album;
}
public int getIdCancion() {
	return idCancion;
}
public void setIdCancion(int idCancion) {
	this.idCancion = idCancion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public int getIdX() {
	return idX;
}
public void setIdX(int idX) {
	this.idX = idX;
}
public Cancion(String nombre, int duracion, Album album, int idX) {
	super();
	this.nombre = nombre;
	this.duracion = duracion;
	this.idAlbum = album;
	this.idX = idX;
}

}

