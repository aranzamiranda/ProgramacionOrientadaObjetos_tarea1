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
public class Pescado {
    private String nombre;
    private String tipo;
    private int anos; 
    private int peso;
    
    public Pescado(){
        nombre = "Desconocido";
        tipo = "Desconocido";
        anos = 0;
        peso = 0;
    }
    public Pescado(String name, String type, int anios, int p){
        this.nombre = name;
        this.tipo = type;
        this.anos = anios; 
        this.peso = p;
    }
     public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
     public int getAnos(){
        return this.anos;
    }
    public void setAnos(int anos){
        this.anos = anos;
    }
     public int getPeso(){
        return this.peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
}
