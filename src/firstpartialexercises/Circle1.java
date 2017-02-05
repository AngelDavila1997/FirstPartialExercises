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
public class Circle1 {
    //Declaracion de atributos
    private double radius;
    private String color;
    //Constructor
    //Se inicializan los atributos en la clase
     public Circle1(){
         radius = 1.0;
         color = "red";
         //this(1.0,"red");
     }
     public Circle1(double radius){
         this.radius = radius;
         this.color = "red";//Se coloca el valor predeterminado debido a que no se le pide al usuario
         //this(radius,"red");
     }
     public Circle1(String color){
         this.radius = 1.0;//Se coloca el valor predeterminado debido a que no se le pide al usuario
         this.color = color;
         //this(1.0,color);
     }
     public Circle1(double radius, String color){
         this.radius = radius;
         this.color = color;
     }
     //get y set
     public double getRadius(){
         return this.radius;
     }
     public String getColor(){
         return this.color;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
     public void setColor(String color){
         this.color = color;
     }
     //Metodos
     @Override
     public String toString(){//Regresa una cadena
         return "Circle [radius=" + this.radius + ",color=" + this.color + "]";
     }
     public double getArea(){//Obtiene el area del circulo
         return Math.PI*(Math.pow(this.radius,2));
     }
}
