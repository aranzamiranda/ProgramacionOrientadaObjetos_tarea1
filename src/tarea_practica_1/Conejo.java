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
public class Conejo {
    private String nombre;
    private String raza; 
    private int edad; 
    private double peso; 
    private double estatura; 
            
    public Conejo(){
        nombre = "Desconocido";
        raza = "Desconocido";
        edad = 0;
        peso = 0;
        estatura = 0;
    }
    public Conejo(String name, String ra, int anos, double p, double e){
        this.nombre = name;
        this.raza = ra; 
        this.edad = anos;
        this.peso = p;
        this.estatura = e;
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
     public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
     public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
     public double getEstatura(){
        return this.estatura;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
}
