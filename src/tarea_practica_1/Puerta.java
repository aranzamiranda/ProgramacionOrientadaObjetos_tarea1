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
public class Puerta {
    private String marca;
    private String color;
    private String tipoMadera;
    private double altura; 
    private double peso; 
    
   public Puerta(){
       marca = "Desconocido";
       color = "Desconocido";
       tipoMadera = "Desconocido";
       altura = 0;
       peso = 0;
   }
     public Puerta(String mAr, String colorres, String type, double alt, double pes){
       this.marca = mAr;
       this.color = colorres;
       this.tipoMadera = type;
       this.altura = alt;
       this.peso = pes;
   }
       public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
     public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public String getTipoMadera(){
        return this.tipoMadera;
    }
    public void setTipoMadera(String tipoMadera){
        this.tipoMadera = tipoMadera;
    }
     public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
     public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
}
