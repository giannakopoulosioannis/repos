/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package names_uppercase;



/**
 *
 * @author user
 */
public class Names_Uppercase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        /**   Ένωσε τις 2 λέξεις
         *      Βάλε τις 2 λέξεις σε μία άλλη μεταβλητή
         *      Την καινούρια μεταβλητή μετέτρεψέ την σε κεφαλαία
         *      Επέσγτρεψε αυτή τη μεταβλητή
                 */
        
      StringBuilder builder = new StringBuilder("This is a text");
      builder = builder.append(". Ok very good");
      // builder.reverse();
      String last = builder.toString();
      builder.append(" more words ");   // ΠΑΊΖΕΙ ΡΟΛΟ Η ΣΕΙΡΑ - ΤΟ STRING DEN ALLAZEI (το last)
      
      System.out.println(builder);
        System.out.println(last);
        
        
        
//        String result = name("Giorgos" , "Papadopoulos" );
//        System.out.println(result);
//        
//    }
//        public static String name(String name1, String name2){
//        
//        String fullName=name1.concat(" " +name2);       //  String fullName=name1.concat(" ").concat(name2);    !!!!  ΕΝΑΛΛΑΚΤΙΚΑ !!!!
//            System.out.println("1. Inside Method:" + fullName);
//        String fullNameUpper=fullName.toUpperCase();
//            System.out.println("2. Inside Methods " + fullNameUpper);
//            return fullNameUpper;
        }
        
        
        
        
        
        
//        String firstName = "Ioannis";
//        String lastName = "Giannakopoulos";
//        String fullName = firstName.concat(" " +lastName);
//        String fullNameUpper = fullName.toUpperCase();
//       
//        System.out.println(fullNameUpper);
//        
//            ///    !!!!!!!!!!!!!!!   NA TO KANO ME METHOD TA STRINGS APO KATO KAI TO PRINT STIN MAIN
    
    }

    

