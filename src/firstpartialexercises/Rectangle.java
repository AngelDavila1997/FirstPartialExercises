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
public class Rectangle {
    //Declaracion de atributos
    private float length;
    private float width;
    //Constructor
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(){
        this(1.0f, 1.0f);
    }
    //get y set
    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    //Metodos
    public double getArea(){ //Obtiene el area del rectangulo
        return this.length*this.width;
    }
    public double getPerimeter(){//Obtiene el perimetro del rectangulo
        return (this.length + this.width) * 2;
    }
    @Override
    public String toString(){//Regresa una cadena
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }
}
