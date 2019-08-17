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
    String marca;
    String color;
    String tipoMadera;
    double altura; 
    double peso; 
    
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
}
