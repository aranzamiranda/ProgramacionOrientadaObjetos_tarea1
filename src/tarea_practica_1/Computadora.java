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
public class Computadora {
    String marca; 
    String tipoProcesador;
    int memoria;
    String color;
    double tamPantalla;
    
    public Computadora(){
        marca = "Desconocido";
        tipoProcesador = "Desconocido";
        memoria = 0;
        color = "Desconocido";
        tamPantalla = 0;
    }
     public Computadora(String m, String tP, int mem, String c, double tPa){
        this.marca = m;
        this.tipoProcesador = tP;
        this.memoria = mem;
        this.color = c;
        this.tamPantalla = tPa;
    }
}
