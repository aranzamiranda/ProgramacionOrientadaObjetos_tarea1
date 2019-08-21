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
    private String marca; 
    private String camara; 
    private String procesador; 
    private double precio; 
    private double tamano;
    private double peso;
    private String color;
    
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
     public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public String getCamara(){
        return this.camara;
    }
    public void setCamara(String camara){
        this.camara = camara;
    }
     public String getProcesador(){
        return this.procesador;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
     public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
     public double getTamano(){
        return this.tamano;
    }
    public void setTamano(double tamano){
        this.tamano = tamano;
    }
     public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
