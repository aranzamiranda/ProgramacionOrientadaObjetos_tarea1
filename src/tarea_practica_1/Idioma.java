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
    String nombre;
    String pais;
    int numSignos;
    int hablantes;
    
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
}
