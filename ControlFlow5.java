/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow5;

/**
 *
 * @author user
 */
public class ControlFlow5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String grade = "B";
    
    switch(grade){
        case "A":
            System.out.println("Perfect");
            break;
        case "B":
            System.out.println("Good");
            break;
        case "C":
        case "D":
            System.out.println("Pass");
            break;
        case "F":
            System.out.println("Fail");
            break;
        default:
            System.out.println("Invalid grade");
    
    }
    
    }
    
}
