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
public class Book1 {
    //Declaracion de atributos
    private String name;
    private Author author;
    private double price;
    private int qty;
    //Constructor
    public Book1(String name, Author author, double price){
        this(name, author, price, 0);
    }
    public Book1(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    //GET Y SET
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return this.qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override//Regresa una cadena
    public String toString(){
        return "Book[name=" + this.name + "," + author.toString() + ",price=" + this.price + ",qty=" + this.qty + "]";
    }
}
