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
    private String raza;
    private String tamano;
    private int anos;
    private String color;
    private String nombre;
    
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
     public String getRaza(){
        return this.raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
     public String getTamano(){
        return this.tamano;
    }
    public void setTamano(String tamano){
        this.tamano = tamano;
    }
     public int getAnos(){
        return this.anos;
    }
    public void setAnos(int anos){
        this.anos = anos;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
