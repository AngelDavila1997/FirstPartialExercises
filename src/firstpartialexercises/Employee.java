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
public class Employee {
    //Declaracion de atributos
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //Constructor
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //GET Y SET
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    //Metodos
    public int raiseSalary(int percent){//Se encarga de sumar al salario actual
        //el salario multiplicado por el porciento entre 100
        return this.salary += this.salary * percent/100;
    }
    @Override
    public String toString(){//Regresa una cadena con la informacion
            return "Employee[id=" + this.id + ",name=" + this.getName() + ",salary=" + this.salary + "]";
    }
}
