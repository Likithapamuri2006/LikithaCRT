import java.util.*;
class Car{
   private String name;
   private String colour;
   private int milage;

   public void setData(String x,String y,int a){
    name=x;
    colour=y;
    milage=a;
   }

   public String getname(){
       return name;
   }
   public String getcolour(){
    return colour;
   }
   public int getmilage(){
    return milage;
   }
}

public class ExampleforEncap2 {
    public static void main(String[]args){
        Car c=new Car();
        c.setData("skoda","White",20);
        System.out.println("The car name:"+c.getname());
        System.out.println("The car colour:"+c.getcolour());
        System.out.println("The car milage:"+c.getmilage());

    }
}
