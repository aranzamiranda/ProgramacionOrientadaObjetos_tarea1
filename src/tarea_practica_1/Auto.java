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
public class Auto {
    private String marca; 
    private String color;
    private int ano;
    private double precio;
    private String tipo;
    
    public Auto(){
        marca = "Desconocido";
        color = "Desconocido";
        ano = 0;
        precio = 0;
        tipo = "Desconocido";
    }
    public Auto(String m, String c, int a, double p, String t){
        this.marca = m;
        this.color = c;
         this.ano = a;
        this.precio = p;
        this.tipo = t;
    }
    public void encender(){
        System.out.println("Encendido");
    }
     public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
     public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
     public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
}
