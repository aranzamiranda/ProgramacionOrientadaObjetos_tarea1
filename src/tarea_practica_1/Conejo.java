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
    String nombre;
    String raza; 
    int edad; 
    double peso; 
    double estatura; 
            
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
}
