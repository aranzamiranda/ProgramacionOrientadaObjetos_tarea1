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
    String nombre; 
    int ano;
    String director;
    int minutos; 
    double calificacion;
    String genero;
    
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
}
