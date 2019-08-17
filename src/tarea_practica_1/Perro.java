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
public class Perro {
    String raza;
    String tamano;
    int anos;
    String color;
    String nombre;
    
    public Perro(){
        raza = "Desconocido";
        tamano = "Desconocido";
        anos = 0;
        color = "Desconocido";
        nombre = "Desconocido";
    }
    public Perro(String r, String t, int a, String c, String n){
        this.raza = r;
        this.tamano = t;
        this.anos = a;
        this.color = c;
        this.nombre = n;
    }
    
    public void comer(){
    System.out.println("Estoy comiendo...");
}
    
}
