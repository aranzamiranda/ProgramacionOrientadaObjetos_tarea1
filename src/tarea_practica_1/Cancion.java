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
public class Cancion {
    private String nombre;
    private String genero;
    private double duracion;
    private String autor;
    
    public Cancion(){
        nombre = "Desconocido";
        genero = "Desconocido";
        duracion = 0;
        autor = "Desconocido";
    }
      public Cancion(String nombree, String generoo, double dura, String autoor){
        this.nombre = nombree;
        this.genero = generoo;
        this.duracion = dura;
        this.autor = autoor;
    }
       public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
     public double getDuracion(){
        return this.duracion;
    }
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
     public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
}
