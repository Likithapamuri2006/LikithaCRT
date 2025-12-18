import java.util.*;
class Demo{
   int a,b,sum;
   int add()
   {
    a=10;
    b=20;
    sum=a+b;
    System.out.println(sum);
    return sum;
   }
}
public class Examplemethod3 {
   public static void main(String[] args) {
    Demo d=new Demo();
    d.add();
   } 
}