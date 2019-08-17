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
public class Libro {
    String nombre;
    int numPag;
    String autor;
    String genero; 
    String editorial;
    
    public Libro(){
        nombre = "Desconocido";
        numPag = 0;
        autor = "Desconocido";
        genero = "Desconocido";
        editorial = "Desconocido";
    }
     public Libro(String nom, int nP, String au, String g, String edi){
        this.nombre = nom;
        this.numPag = nP;
        this.autor = au;
        this.genero = g;
        this.editorial = edi;
    }
}
