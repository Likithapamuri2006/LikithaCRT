import java.util.*;
class Animal{
  void makeSound(){
    System.out.println("animals are precious");
  }
  }
 class Dog extends Animal{
 void makeSound(){
    super.makeSound();
     System.out.println("dog barks");
 }
}
public class Assignment3 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
    }
}