import java.util.*;
class Credit{   //parent class
    int cardNo=111234;
    int pinNo=11111;
}

class Hacker extends Credit{    //child class
    void viewDetails(){
        System.out.println(cardNo);
        System.out.println(pinNo);
    }
    void changeDetails(){
        cardNo=111111;
        pinNo=123456;
    }
}


public class Exampleinheritance {
    public static void main(String[]args){
      Hacker h=new Hacker();
      h.viewDetails();
      System.out.println("----------------------------------------");
      h.viewDetails();
    } 
}
