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
    private String nombre;
    private int numeroDeArboles;
    private String tamano;
    private int anos;
    private String familia;
    
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
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public int getNumeroDeArboles(){
        return this.numeroDeArboles;
    }
    public void setNumeroDeArboles(int numeroDeArboles){
        this.numeroDeArboles = numeroDeArboles;
    }
     public String getTamano(){
        return this.tamano;
    }
    public void setTamano(String tamano){
        this.tamano = tamano;
    }
     public int getAnos(){
        return this.anos;
    }
    public void setAnos(int anos){
        this.anos = anos;
    }
     public String getFamilia(){
        return this.familia;
    }
    public void setFamilia(String familia){
        this.familia = familia;
    }
}
