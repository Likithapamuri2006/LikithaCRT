import java.util.*;
class Additon implements Runnable{
    public void run(){
          System.out.println("addition task started");
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the value of num1");
          int num1=sc.nextInt();
          System.out.println("enter value of num2");
          int num2=sc.nextInt();
          int sum=num1+num2;
          System.out.println("the result is:"+sum);
          System.out.println("addition task completed:");   
      }
}
class Character implements Runnable{
    public void run(){
         System.out.println("character printing started");
        for(int i=65;i<=75;i++){
         System.out.println ("the characters are printing "+(char)i);
         try{
         Thread.sleep(1000);
         }
         catch(Exception e){
             e.printStackTrace();
    }
}
System.out.println("character printing task completed");
  }
}
class Number implements Runnable{
   public void run(){
    System.out.println("number printing started");
    for(int i=1;i<=10;i++){
    System.out.println("the numbers are "+i);
    try{
   Thread.sleep(1000);
       }
      catch(Exception e){
       e.printStackTrace();
       }
}
System.out.println("numbers printing task completed");

   }
}
public class Exampleforrunable {
    public static void main(String[] args) {
        Additon a=new Additon();
        Character c=new Character();
        Number n=new Number();
          Thread t1=new Thread(a);
          Thread t2=new Thread(c);
          Thread t3=new Thread(n);
          t1.start();
          t2.start();
          t3.start();
    }
}