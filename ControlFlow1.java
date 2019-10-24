/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow1;

/**
 *
 * @author user
 */
public class ControlFlow1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Exercise 1
   
    int age = 16;
    
    if(age == 5){
        System.out.println("You are going to Kindergarten");
    } if(age >=6 && age <= 11) {
        System.out.println("You are going to Elementary School");
    } if(age >= 12 && age<= 14){
        System.out.println("You are going to Middle School");
    } if(age >=15 && age <=17){
        System.out.println("You are going to High School");
    } if (age <5 || age>17){
        System.out.println("You are not going to school");
    }
    
    }
    
}
