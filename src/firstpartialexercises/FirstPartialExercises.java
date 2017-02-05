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
public class FirstPartialExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint uno = new MyPoint(8,3);
        MyPoint dos = new MyPoint(2,3);
        MyRectangle rec = new MyRectangle(uno,dos);
        System.out.println(rec.toString());
    }
    
}
