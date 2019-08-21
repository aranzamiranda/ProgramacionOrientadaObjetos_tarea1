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
    private String marca; 
    private double megapixeles; 
    private String color; 
    private double memoria; 
    private String tipoLente;
    
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
     public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public double getMegapixeles(){
        return this.megapixeles;
    }
    public void setMegapixeles(double megapixeles){
        this.megapixeles = megapixeles;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public double getMemoria(){
        return this.memoria;
    }
    public void setMemoria(double memoria){
        this.memoria = memoria;
    }
     public String getTipoLente(){
        return this.tipoLente;
    }
    public void setTipoLente(String tipoLente){
        this.tipoLente = tipoLente;
    }
}
