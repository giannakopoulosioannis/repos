/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow6;

/**
 *
 * @author user
 */
public class ControlFlow6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int age = 17;
    
    if(age <16) {
        System.out.println("You cannot drive or vote");
    } else if(age >=16 && age<=17){
        System.out.println("You can drive but not vote");
    } else if(age >=18 && age <=21){
        System.out.println("You can vote but not drink");
    } else {
        System.out.println("You can do anything");
        }
        
    }
    
}
