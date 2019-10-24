/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow8;

/**
 *
 * @author user
 */
public class ControlFlow8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    int weekday ;
    String message = message(2);
    
    System.out.println(message); 
    
    }
    public static String message(int weekday){
        
        String message;
        switch(weekday){
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
                message = "Invalid number";
        }
              
        return message;
    
}
}
