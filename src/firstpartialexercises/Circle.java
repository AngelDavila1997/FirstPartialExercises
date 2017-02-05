/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author PC
 */
public class Circle {
    //Declaracion de atributos
    private double radius;
    //Constructor
    //Se inicializan los atributos en la clase
     public Circle(){
         this(1.0);
     }
     public Circle(double radius){
         this.radius = radius;
     }
     //get y set
     public double getRadius(){
         return this.radius;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
     //Metodos
     public double getArea(){ //Se saca el area del circulo
       return Math.pow(this.radius,2) * Math.PI;
     }  
     public double getCircumference(){ //Se saca a circunferencia del circulo
         return this.radius * 2 * Math.PI;
     }
     @Override
     public String toString(){//Regresa una cadena
         return "Circle[" + this.radius + "]";
     }
}
