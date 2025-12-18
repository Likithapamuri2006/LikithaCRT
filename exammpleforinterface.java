import java.util.*;
interface Calculator{
    void add();
    void sub();
}
class MyCalculator implements Calculator{
   public void add(){
        int num1=20;
        int num2=30;
        int sum=num1+num2;
        System.out.println("the sum is:"+sum);
    }
     public void sub(){
         int num1=20;
        int num2=30;
        int diff=num1-num2;
        System.out.println("the difference is:"+diff);
    }
}
class MyCalculator2 implements Calculator{
    public void add(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is:"+sum);
    }
   public void sub(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int diff=num1-num2;
        System.out.println("The difference is:"+diff);
    }
}


public class exammpleforinterface {
    public static void main(String[] args) {
        MyCalculator m1 = new MyCalculator();
        MyCalculator2 m2 = new MyCalculator2();
        m1.add();
        m1.sub();
         
        m2.add();
        m2.sub();
    }
}
