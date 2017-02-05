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
public class Time {
    //Declaracion de atributos
    private int hour;
    private int minute;
    private int second;
    //Constructor
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //GET Y SET
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //Metodos
    @Override//Regresa una cadena
    public String toString(){
        return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second);
    }
    public Time nextSecond(){//Suma un segundo
        this.second++;//Se suma un segundo
        if(this.second==60){//Si el segundo es igual a 60
            this.second = 00;//El segundo se volvera 00
            this.minute++;//Al minuto se le suma 1
        }
        if(this.minute==60){//Si el minuto es igual a 60
            this.minute = 00;//El minuto se volvera 00
            this.hour++;//A la hora se le suma 1
        }
        if(this.hour==24){//Si la hora es 24
            this.hour = 00;//La hora se volvera 00
        }
        return this;
    }
    public Time previousSecond(){//Resta un segundo
        this.second--;//Se resta un segundo
        if(this.second==-1){//Si el segundo es -1
            this.second = 59;//El segundo se volvera 59
            this.minute--;//Al minuto se le restara 1
        }
        if(this.minute==-1){//Si el minuto es -1
            this.minute = 59;//El minuto se volvera 59
            this.hour--;//A la hora se restara 1
        }
        if(this.hour==-1){//Si la hora es -1
            this.hour = 23;//La hora se volvera 23
        }
        return this;
    }
}
