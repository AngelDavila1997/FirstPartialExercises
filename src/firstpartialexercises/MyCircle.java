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
public class MyCircle {
    //Declaracion de atributos
    private MyPoint center;
    private int radius;
    //Constructor
    public MyCircle() {
        this(0,0,1);
    }
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    //GET Y SET
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return this.center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }    
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){//Manda a llamar un metodo de MyPoint
        return this.center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    @Override
    public String toString(){//Regresa una cadena
        return "MyCircle[radius=" + this.radius + ",center=" + center.toString() + "]";
    }
    public double getArea(){//Obtiene el area del circulo
        return Math.PI*(Math.pow(this.radius,2));
    }
    public double getCircumference(){//Obtiene la circunferencia
        return Math.PI*2*this.radius;
    }
    public double distance(MyCircle another){//Obtiene la distancia conforme a un objeto MyPoint
        //usando el metodo distancia de MyPoint mandando como argumento el objeto
        return center.distance(another.center);
    }
}
