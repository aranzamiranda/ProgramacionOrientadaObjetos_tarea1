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
public class Celular {
    String marca; 
    String camara; 
    String procesador; 
    double precio; 
    double tamano;
    double peso;
    String color;
    
    public Celular(){
        marca = "Desconocido";
        camara = "Desconocido";
        procesador = "Desconocido";
        precio = 0;
        tamano = 0;
        peso = 0;
        color = "Desconocido";
    }
    public Celular(String marc, String camera, String pros, double pre, double tam, double pes, String colo){
        this.marca = marc;
        this.camara = camera;
        this.procesador = pros;
        this.precio = pre; 
        this.tamano = tam;
        this.peso = pes;
        this.color = colo;
    }
}
