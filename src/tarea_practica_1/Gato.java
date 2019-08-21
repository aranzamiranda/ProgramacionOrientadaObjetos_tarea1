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
public class Gato {
    private String nombre;
    private String raza;
    private int anos; 
    private String color;
    private String tamano;
    
    public Gato(){
        nombre = "Desconocido";
        raza = "Desconocido";
        anos = 0;
        color = "Desconocido";
        tamano = "Desconocido";
    }
    public Gato(String no, String ra, int edad, String col, String tam){
        this.nombre = no;
        this.raza = ra;
        this.anos = edad;
        this.color = col;
        this.tamano = tam;
    }
     public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getRaza(){
        return this.raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
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
     public String getTamano(){
        return this.tamano;
    }
    public void setTamano(String tamano){
        this.tamano = tamano;
    }
}
