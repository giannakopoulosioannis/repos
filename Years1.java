/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package years1;

/**
 *
 * @author user
 */
public class Years1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // Exercise #Some Math 1
    
    int currentYear = 2019;
    int age1 = 99;
    int age2 = 81;
    int age3 = 87;
    
    int born1;
    born1 = currentYear - age1;
        System.out.println("The year John was born was " + born1);
        System.out.println("John was " + (1960 - born1) + " in 1960 and will be " + (2040 - born1) + " in 2040" );
        
    int born2;
    born2 = currentYear - age2;
        System.out.println("The year Nick was born was " + born2);
        System.out.println("Nick was " + (1960 - born2) + " in 1960 and will be " + (2040 - born2) + " in 2040" );
        
    int born3;
    born3 = currentYear - age3;
        System.out.println("The year Jimmy was born was " + born3);
        System.out.println("Jimmy was " + (1960 - born3) + " in 1960 and will be " + (2040 - born3) + " in 2040" );
    
    }
    
}
