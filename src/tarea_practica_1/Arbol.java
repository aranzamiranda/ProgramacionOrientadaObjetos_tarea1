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
public class Arbol {
    String nombre;
    int numeroDeArboles;
    String tamano;
    int anos;
    String familia;
    
    public Arbol(){
        nombre = "Desconocido";
        numeroDeArboles = 0;
        tamano = "Desconocido";
        anos = 0;
        familia = "Desconocido";
        
    }
    public Arbol(String n, int nA, String ta, int an, String fa){
        this.nombre = n;
        this.numeroDeArboles = nA;
        this.tamano = ta;
        this.anos = an;
        this.familia = fa;
    }
}
