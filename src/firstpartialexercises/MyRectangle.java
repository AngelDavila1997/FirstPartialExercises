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
public class MyRectangle {
    //Declaracion de atributos
    private MyPoint topLeft;
    private MyPoint bottomRight;
    //Constructor
    public MyRectangle(int x1, int y1, int x2, int y2){
        topLeft = new MyPoint (x1, y1);
        bottomRight = new MyPoint (x2, y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    //GET Y SET
    public MyPoint getTopLeft(){
        return this.topLeft;
    }
    public void setTopLeft(MyPoint topLeft){
        this.topLeft = topLeft;
    }
    public MyPoint getBottomRight() {
        return this.bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    public int getTopLeftX(){
        return this.topLeft.getX();
    }
    public void setTopLeftX(int x){
        this.topLeft.setX(x);
    }    
    public int getTopLeftY(){
        return this.topLeft.getY();
    }
    public void setTopLeftY(int y){
        this.topLeft.setY(y);
    }
    public int getBottomRightX(){
        return this.bottomRight.getX();
    }
    public void setBottomRightX(int x){
        this.bottomRight.setX(x);
    }    
    public int getBottomRightY(){
        return this.bottomRight.getY();
    }
    public void setBottomRightY(int y){
        this.bottomRight.setY(y);
    }
    //Metodos
    @Override
    public String toString(){//Regresa un String
        return "MyRectangle[topLeft=" + topLeft.toString() + ",bottomRight=" + bottomRight.toString() + "]";
    }
}
