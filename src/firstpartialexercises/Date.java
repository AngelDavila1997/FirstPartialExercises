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
public class Date {
    //Declaracion de atributos
    private int day;
    private int month;
    private int year;
    //Constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //GET Y SET
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public  void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString(){
       // if(this.day<10 && this.month<10){
       //     return "0" + this.day + "/" + this.month + "/" + this.year;
       // }else if(this.day<10 && this.month>10){
       //     return "0" + this.day + "/" + this.month + "/" + this.year;
       // }else if (this.day>10 && this.month<10){
       //     return this.day + "/" + "0" + this.month + "/" + this.year;
       // }else{
       //     return this.day + "/" + this.month + "/" + this.year;
       // }
       //Se utiliza un formato para indicar que debe de haber un 0 si el numero esta entre 0-9
     return String.format("%02d", this.day) + "/" + String.format("%02d", this.month) + "/" + this.year;
     //02d por dos digitos
    }
}
