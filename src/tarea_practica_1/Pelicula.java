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
public class Pelicula {
    private String nombre; 
    private int ano;
    private String director;
    private int minutos; 
    private double calificacion;
    private String genero;
    
    public Pelicula(){
       nombre = "Desconocido";
       ano = 0;
       director = "Desconocido";
       minutos = 0;
       calificacion = 0;
       genero = "Desconocido";
    }
        public Pelicula(String nom, int anoo, String dire, int min, double cal, String ge){
       this.nombre = nom;
       this.ano = anoo;
       this.director = dire;
       this.minutos = min;
       this.calificacion = cal;
       this.genero = ge;
    }
    
    
    public void reproducirse(){
        System.out.println("Reproduciendose");
    }
     public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
     public String getDirector(){
        return this.director;
    }
    public void setDirector(String director){
        this.director = director;
    }
     public int getMinutos(){
        return this.minutos;
    }
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
     public double getCalificacion(){
        return this.calificacion;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
     public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
