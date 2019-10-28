
package mypackage;


public class MainClass {
    
   // additional Class files are point.java & circle
    
    public static void main(String[] args) {
        
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setBothPoints(8, 4);  
        p2.setBothPoints(8, 17);
               
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setRadius(17);       
        c2.setRadius(18);
        c1.setPoint(p1);
        c2.setPoint(p2);
        c1.setCirclePoint(5, p1);
        c2.setCirclePoint(6, p2);
        
        System.out.println("Circles created= " + Circle.getCirclesCreated());
        c1.showDetails();
        c2.showDetails();
        
        }
}

