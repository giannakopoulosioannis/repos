/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow7;

/**
 *
 * @author user
 */
public class ControlFlow7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double weight = 95;
    String planet = "Mars";
    
    switch(planet) {
        case "Venus":
            System.out.println("Your relative weight on Venus is " + weight * 0.78);
            break;
        case "Mars":
            System.out.println("Your relative weight on Mars is " + weight * 0.39);
            break;
        case "Jupiter":
            System.out.println("Your relative weight on Jupiter is " + weight * 2.65);
            break;
        case "Saturn":
            System.out.println("Your relative weight on Saturn is " + weight * 1.17);
            break;
        case "Uranus":
            System.out.println("Your relative weight on Uranus is " + weight * 1.05);
            break;
        case "Neptune":
            System.out.println("Your relative weight on Neptune is " + weight * 1.23);
            break;
        default:
            System.out.println("Invalid Planet");
    } 
    
    }
    
}
