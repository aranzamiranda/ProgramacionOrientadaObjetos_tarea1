/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_practica_1;

/**
 *
 * @author chiky
 */
public class Libro {
    private String nombre;
    private int numPag;
    private String autor;
    private String genero; 
    private String editorial;
    
    public Libro(){
        nombre = "Desconocido";
        numPag = 0;
        autor = "Desconocido";
        genero = "Desconocido";
        editorial = "Desconocido";
    }
     public Libro(String nom, int nP, String au, String g, String edi){
        this.nombre = nom;
        this.numPag = nP;
        this.autor = au;
        this.genero = g;
        this.editorial = edi;
    }
      public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public int getNumPag(){
        return this.numPag;
    }
    public void setNumPag(int numPag){
        this.numPag = numPag;
    }
     public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
     public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
     public String getEditorial(){
        return this.editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
}
