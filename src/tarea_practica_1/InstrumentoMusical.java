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
    private String nombre;
    private String color;
    private int numInstrumentos;
    private double precio;
    
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
      public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public int getNumInstrumentos(){
        return this.numInstrumentos;
    }
    public void setNumInstrumentos(int numInstrumentos){
        this.numInstrumentos = numInstrumentos;
    }
     public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
}
