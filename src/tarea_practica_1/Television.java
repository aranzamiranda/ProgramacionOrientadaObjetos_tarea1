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
    private String marca; 
    private double pulgadasPantalla; 
    private String tipo; 
    private String color;
    
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
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public double getPulagadasPantalla(){
        return this.pulgadasPantalla;
    }
    public void setPulgadasPantalla(double pulgadasPantallas){
        this.pulgadasPantalla = pulgadasPantallas;
    }
     public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
