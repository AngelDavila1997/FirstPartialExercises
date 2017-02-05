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
public class MyPoint {
    //Decalracion de atributos
    private int x;
    private int y;
    //Constructor
    public MyPoint() {
        this(0,0);
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //GET Y SET
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){//Crea un arreglo que guarda los valores de x y y
        int[]a={this.x, this.y};
        return a;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){//Regresa una cadena
        return "(" + this.x + "," + this.y + ")";
    }
    public double distance(int x, int y){//Calcula la distancia conforme a un punto dado (dos enteros)
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
    }
    public double distance(MyPoint another){//Calcula la distancia conforme a un punto dado (objeto MyPoint)
        return Math.sqrt(Math.pow(this.x-another.getX(),2) + Math.pow(this.y-another.getY(),2));
    }
    public double distance(){//Calcula la distancia conforme a este punto
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }
}
