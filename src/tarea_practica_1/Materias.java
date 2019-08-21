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
public class Materias {
    private String nombre; 
    private String campoDeConocimiento; 
    private double calificacion;
    private String maestro; 
    
    public Materias(){
        nombre = "Desconocido";
        campoDeConocimiento = "Desconocido";
        calificacion = 0;
        maestro = "Desconocido";
    }
    public Materias(String name, String cDc, double cal, String maes){
        this.nombre = name; 
        this.campoDeConocimiento = cDc;
        this.calificacion = cal; 
        this.maestro = maes;
    }
     public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getCampoDeConocimiento(){
        return this.campoDeConocimiento;
    }
    public void setCampoDeConocimiento(String campoDeConocimiento){
        this.campoDeConocimiento = campoDeConocimiento;
    }
     public double getCalificacion(){
        return this.calificacion;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
     public String getMaestro(){
        return this.maestro;
    }
    public void setMaestro(String maestro){
        this.maestro = maestro;
    }
}
