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
public class Libreta {
    String marca; 
    double gramaje; 
    int paginas; 
    String color;
    String tipo;
    
    public Libreta(){
        marca = "Desconocido";
        gramaje = 0;
        paginas = 0;
        color = "Desconocido";
        tipo = "Desconocido";
    }
    public Libreta(String marcas, double gra, int pag, String colour, String type){
        this.marca = marcas; 
        this.gramaje = gra; 
        this.paginas = pag; 
       this.color = colour; 
       this.tipo = type;
    }
}
