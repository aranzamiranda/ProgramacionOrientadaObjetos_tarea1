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
public class Television {
    String marca; 
    double pulgadasPantalla; 
    String tipo; 
    String color;
    
    public Television(){
        marca = "Desconocido";
        pulgadasPantalla = 0;
        tipo = "Desconocido";
        color = "Desconocido";
    }
    public Television(String marc, double pP, String t, String clr){
        this.marca = marc;
        this.pulgadasPantalla = pP;
        this.tipo = t;
        this.color = clr;
    }
}
