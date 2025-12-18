import java.util.*;
abstract class calculator{
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
}

class Mycalculator extends calculator{
    void add(){
        int num1=20;
        int num2=30;
        int sum=num1+num2;
        System.out.println("the sum is:"+sum);
    }
    void sub(){
         int num1=20;
        int num2=30;
        int diff=num1-num2;
        System.out.println("the difference is:"+diff);
    }
    void mul(){
         int num1=20;
        int num2=30;
        int mul=num1*num2;
        System.out.println("the product is:"+mul);
    }
    void div(){
         int num1=20;
        int num2=30;
        int div=num1/num2;
        System.out.println("the quotient is:"+div);
    }
}

class Mycalculator2 extends calculator{
    void add(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is:"+sum);
    }
    void sub(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int diff=num1-num2;
        System.out.println("The difference is:"+diff);
    }
    void mul(){
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int mul=num1*num2;
        System.out.println("The product is:"+mul);
    }
    void div(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int div=num1/num2;
        System.out.println("The quotient  is:"+div);
    }
} 
class Math{
    void arithmetic(calculator c){
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
public class exampleforAbstraction2 {
    public static void main(String[] args) {
        Mycalculator m1 = new Mycalculator();
        Mycalculator2 m2 = new Mycalculator2();

        Math m = new Math();
        m.arithmetic(m1);
        System.out.println("-----------------------------------");
        m.arithmetic(m2);
    }
}
