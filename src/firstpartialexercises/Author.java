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
public class Author {
    //Declaracion de atributos
    private String name;
    private String email;
    private char gender;
    //Constructor
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //GET Y SET
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString(){//Regresa una cadena
        return "Author[name=" + this.name + ",email=" + this.email + ",gender=" + this.gender + "]";
    }
}
