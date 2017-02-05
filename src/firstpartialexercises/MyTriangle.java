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
public class MyTriangle {
    //Declaracion de atributos
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    //Constructor
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint (x1, y1);
        v2 = new MyPoint (x2, y2);
        v3 = new MyPoint (x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString(){//Regresa una cadena
        return "MyTriangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + "]";
    }
    public double getPerimeter(){//Suma la distancia de los 3 lados
        return v1.distance() + v2.distance() + v3.distance();
    }
    public String getType(){//Checa el valor de los lados y regresa que tipo de triangulo es
        String a = "";
        if(v1.distance() == v2. distance() && v1.distance() == v3.distance() && v2.distance() == v3.distance()){
            //Si todas las distancias son iguales
            return a += "Equilatero";//Imprimira equilatero
        } else if(v1.distance() != v2.distance() && v1.distance() != v3.distance() && v2.distance() != v3.distance()){
            //Si todos los lados son diferentes entre si
            return a += "Escaleno";//Imprimira escaleno
        }else{//Si no
            return a += "Isosceles";//Imprimira isosceles
        }
    }
}
