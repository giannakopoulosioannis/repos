/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary.taxes;

/**
 *
 * @author user
 */
public class SalaryTaxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
                // Exercise = Some Math#2
 
        int monthlySalary = 900;
        int taxMonthly;
    
        taxMonthly = (900*9)/100;
        System.out.println("My monthly salary after tax = " + (monthlySalary - taxMonthly));
        System.out.println("My yearly salary after tax = " + ((monthlySalary - taxMonthly)*12));
        System.out.println("My monthly tax is " + taxMonthly + " and my yearly tax " + (taxMonthly *12));
    
    }
    
}
