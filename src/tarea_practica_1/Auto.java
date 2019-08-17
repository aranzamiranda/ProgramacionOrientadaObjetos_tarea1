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
public class Auto {
    String marca; 
    String color;
    int ano;
    double precio;
    String tipo;
    
    public Auto(){
        marca = "Desconocido";
        color = "Desconocido";
        ano = 0;
        precio = 0;
        tipo = "Desconocido";
    }
    public Auto(String m, String c, int a, double p, String t){
        this.marca = m;
        this.color = c;
         this.ano = a;
        this.precio = p;
        this.tipo = t;
    }
    public void encender(){
        System.out.println("Encendido");
    }
    
}
