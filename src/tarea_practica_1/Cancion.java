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
    String nombre;
    String genero;
    double duracion;
    String autor;
    
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
}
