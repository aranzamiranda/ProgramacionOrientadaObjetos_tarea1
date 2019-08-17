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
    String nombre; 
    String campoDeConocimiento; 
    double calificacion;
    String maestro; 
    
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
}
