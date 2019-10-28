
package mypackage;


public class Circle {
    private Point point;
    private int radius;
    private static int circlesCreated;
    private static int showedCircleDetails;
    
    public static int getCirclesCreated(){
        return circlesCreated;
    }
            
    
    
    public Circle(){                        
        circlesCreated++;
        System.out.println("Circles in Heap " + circlesCreated);
    }
    
    public void setRadius(int radius){
        if(radius>0){
            this.radius = radius;
        }
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void setPoint(Point point){
        this.point = point;
    }
    
    public Point getPoint(){
        return this.point;
    }
    
    public void setCirclePoint(int r, Point p){
       setRadius(r); 
       setPoint(p); 
                
    } 
    
    
    public int getCircleX(){
        return this.point.getX();
    }
    
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    
    
    
    public void showDetails(){
        showedCircleDetails++;
        String detail1 = "radius:" + radius;
        String space = " ";
        
        String detailX = "circleX = "+ this.point.getX();
        String detailY = "circleY = "+ this.point.getY();
        
        String result = detail1 + space + detailX + space + detailY;
        System.out.println(result);        
    }
    
}
