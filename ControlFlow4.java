/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow4;

/**
 *
 * @author user
 */
public class ControlFlow4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String daysPerMonth = "August";
        
        switch(daysPerMonth) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("This month has 31 days");
                break;
            case "February":    
                System.out.println("This month has 28 or 29 days");
                break;
            case "April":   
            case "June":
            case "September":
            case "November":   
                System.out.println("This month has 30 days");
                break;
            default:
                System.out.println("Invalid Input");
        }
    
    }
    
}
