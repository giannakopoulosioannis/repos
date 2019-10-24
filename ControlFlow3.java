/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow3;

/**
 *
 * @author user
 */
public class ControlFlow3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String currentMonth = "June";
        
        switch(currentMonth) {
            case "December":
            case "January":
            case "February":    
                System.out.println("It is Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It is Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("It is Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("It is Autumn");
                break;
            default:
                System.out.println("Invalid Input");
        }
    
    }
    
}
