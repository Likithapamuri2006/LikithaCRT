import java.util.*;
class Rectangle{
    int area(int l,int b){
        return l*b;
    }
    float area(int l,float b){
        return l*b;
    }
    int area(int l,int b,int h){
        return l*b*h;
    }
}
public class Methodoverloading {
    public static void main(String[]args){
        Rectangle r=new Rectangle();
       System.out.println(r.area(10,20)); 
         System.out.println(r.area(10,20.5f)); 
        System.out.println(r.area(10,20,10));
      
    }
}
