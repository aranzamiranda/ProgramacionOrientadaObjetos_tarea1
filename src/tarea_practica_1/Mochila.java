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
public class Mochila {
    private String marca; 
    private double precio;
    private String color; 
    private double peso; 
    private String tipo;
    
    public Mochila(){
        marca = "Desconocido";
        precio = 0;
        color = "Desconocido";
        peso = 0;
        tipo = "Desconocido";
    }
      public Mochila(String marc, double pre, String colorr, double p, String t){
        marca = "Desconocido";
        precio = 0;
        color = "Desconocido";
        peso = 0;
        tipo = "Desconocido";
    }
      
       public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
     public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
