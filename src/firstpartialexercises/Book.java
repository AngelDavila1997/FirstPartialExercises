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
public class Book {
    //Declaracion de atributos
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    //Constructor
    public Book(String name, Author[] authors, double price){
        this(name, authors, price, 0);
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    //GET Y SET
    public String getName() {
        return this.name;
    }
    public Author[] getAuthors() {
        return this.authors;
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
    //Metodos
    @Override//Regresa una cadena
    public String toString(){
        return "Book[name=" + this.name + ",authors={" + getAuthorNames() + "price=" + this.price + ",qty=" + this.qty + "]";
    }
    public String getAuthorNames(){//Crea un ciclo para ir sumando los diferentes autores a un String
        String a = "";
        for(int i=0;i<authors.length;i++){
        a += authors[i].toString() + ",";
        }
        return a;
    }
}
