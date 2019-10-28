package mypackage;



public class Point {
    private int x;
    private int y;
    
    public void setX(int x){
       if(x>0){                 
        this.x = x;}
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
       if(y>0){        
        this.y = y;}
    }
    public int getY(){
        return y;
    }
    public void  setBothPoints(int x, int y){
    setX(x);             
    setY(y);          
             
    }
    public void showDetailsXY(){
    
        System.out.println("x= " +x +" y= " + y);
    }
    
    
}
