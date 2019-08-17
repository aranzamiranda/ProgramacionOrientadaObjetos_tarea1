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
    String nombre;
    String tipo;
    int anos; 
    int peso;
    
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
}
