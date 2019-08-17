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
public class Gato {
    String nombre;
    String raza;
    int anos; 
    String color;
    String tamano;
    
    public Gato(){
        nombre = "Desconocido";
        raza = "Desconocido";
        anos = 0;
        color = "Desconocido";
        tamano = "Desconocido";
    }
    public Gato(String no, String ra, int edad, String col, String tam){
        this.nombre = no;
        this.raza = ra;
        this.anos = edad;
        this.color = col;
        this.tamano = tam;
    }
}
