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
public class InstrumentoMusical {
    String nombre;
    String color;
    int numInstrumentos;
    double precio;
    
    public InstrumentoMusical(){
        nombre = "Desconocido";
        color = "Desconocido";
        numInstrumentos = 0;
        precio = 0;
    }
     public InstrumentoMusical(String n, String c, int nI, double p){
        this.nombre = n;
        this.color = c;
        this.numInstrumentos = nI;
        this.precio = p;
    }
    
}
