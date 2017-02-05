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
public class Account {
    //Declaracion de atributos
    private String id;
    private String name;
    private int balance;
    //Constructor
    public Account(String id, String name){
       this(id,name,0);
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    //GET Y SET
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    //Metodos
    public int credit(int amount){//Suma el balance con la cantidad
        return this.balance+=amount;
    }
    public int debit(int amount){//Se encarga de restar al balance la cantidad
        if(amount<=this.balance){//Si la cantidad es menor o igual al balance
            this.balance -= amount;//Al balance se le restara la cantidad
        }else{//Si no
            System.out.println("Amount exceeded balance");//Imprimira la cadena
        }
        return this.balance;//De cualquier manera, regresara el balance
    }
    public int transferTo(Account another, int amount){//Transfiere dinero de una cuenta a otra
        if(amount<=this.balance){//Si la cantidad es menor o igual al balance
           another.credit(amount);//Se suma a la cuenta la cantidad
           this.balance -= amount;//Se resta de esta cuenta la cantidad
        }else{//Si no
           System.out.println("Amount exceeded balance");//Imprimira la cadena
        }
        return this.balance;
    }
    @Override//De cualquier manera, regresara el balance
    public String toString(){//Regresara una cadena
        return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
    }
}

