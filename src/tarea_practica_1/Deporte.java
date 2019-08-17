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
public class Deporte {
    String name;
    String liga; 
    int jugadores;
    String entrenador;
    
    public Deporte(){
        name = "Desconocido";
        liga = "Desconocido";
        jugadores = 0;
        entrenador = "Desconocido";
    }
    public Deporte(String nombre, String l, int jug, String entr){
        this.name = nombre;
        this.liga = l; 
        this.jugadores = jug; 
        this.entrenador = entr;
    }
}
