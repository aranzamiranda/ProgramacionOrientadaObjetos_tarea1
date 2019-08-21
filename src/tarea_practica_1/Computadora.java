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
public class Computadora {
    private String marca; 
    private String tipoProcesador;
    private int memoria;
    private String color;
    private double tamPantalla;
    
    public Computadora(){
        marca = "Desconocido";
        tipoProcesador = "Desconocido";
        memoria = 0;
        color = "Desconocido";
        tamPantalla = 0;
    }
     public Computadora(String m, String tP, int mem, String c, double tPa){
        this.marca = m;
        this.tipoProcesador = tP;
        this.memoria = mem;
        this.color = c;
        this.tamPantalla = tPa;
    }
      public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public String getTipoProcesador(){
        return this.tipoProcesador;
    }
    public void setTipoProcesador(String tipoProcesador){
        this.tipoProcesador = tipoProcesador;
    }
     public int getMemoria(){
        return this.memoria;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public double getTamPantalla(){
        return this.tamPantalla;
    }
    public void setTamPantalla(double tamPantalla){
        this.tamPantalla = tamPantalla;
    }
}
