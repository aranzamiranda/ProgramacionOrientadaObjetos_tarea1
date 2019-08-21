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
    private String marca; 
    private double gramaje; 
    private int paginas; 
    private String color;
    private String tipo;
    
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
     public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public double getGramaje(){
        return this.gramaje;
    }
    public void setGramaje(double gramaje){
        this.gramaje = gramaje;
    }
     public int getPaginas(){
        return this.paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
