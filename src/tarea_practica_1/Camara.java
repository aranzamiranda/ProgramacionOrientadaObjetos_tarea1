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
public class Camara {
    String marca; 
    double megapixeles; 
    String color; 
    double memoria; 
    String tipoLente;
    
    public Camara(){
        marca = "Desconocido";
        megapixeles = 0;
        color = "Desconocido";
        memoria = 0;
        tipoLente = "Desconocido";
    }
    public Camara(String m, double mp, String co, double me, String tL){
        this.marca = m;
        this.megapixeles = mp;
        this.color = co;
        this.memoria = me;
        this.tipoLente = tL;
    }
}
