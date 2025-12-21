import java.util.*;


public class ExampleforStack {
    public static void main(String[] args) {
        Stack <Object>s=new Stack<>();
        s.push(10);
        s.push("Java");
        s.push("python");

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());

        for(Object obj:s){
            System.out.println(obj);
        }
    }
}
