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
public class Idioma {
    private String nombre;
    private String pais;
    private int numSignos;
    private int hablantes;
    
    public Idioma(){
    nombre = "Desconocido";
    pais = "Desconocido";
    numSignos = 0;
    hablantes = 0;
}
    public Idioma(String n, String country, int nS, int h){
        this.nombre = n;
        this.pais = country;
        this.numSignos = nS;
        this.hablantes = h;
    }
     public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getPais(){
        return this.pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
     public int getNumSignos(){
        return this.numSignos;
    }
    public void setNumSignos(int numSignos){
        this.numSignos = numSignos;
    }
     public int getHablantes(){
        return this.hablantes;
    }
    public void setHablantes(int hablantes){
        this.hablantes = hablantes;
    }
}
