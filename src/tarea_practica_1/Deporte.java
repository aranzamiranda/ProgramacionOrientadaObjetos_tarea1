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
    private String name;
    private String liga; 
    private int jugadores;
    private String entrenador;
    
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
     public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
     public String getLiga(){
        return this.liga;
    }
    public void setLiga(String liga){
        this.liga = liga;
    }
     public int getJugadores(){
        return this.jugadores;
    }
    public void setJugadores(int jugadores){
        this.jugadores = jugadores;
    }
     public String getEntrenador(){
        return this.entrenador;
    }
    public void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }
}
