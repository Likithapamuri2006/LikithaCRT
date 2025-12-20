import java.util.*;
public class ExampleforVector {
    public static void main(String[] args) {
        Vector<Object> v= new Vector<>();
        v.add(10);
        v.add(20);
        v.add(40);
        v.add("java");

        System.out.println(v);
        System.out.println("--------------------------");
        System.out.println(v.get(2));
        System.out.println("--------------------------");
        System.out.println(v.isEmpty());
        System.out.println("--------------------------");
        System.out.println(v.contains(2));
        System.out.println("--------------------------");
        System.out.println(v.size());
        System.out.println("--------------------------");

        for(Object i:v){
            System.out.println(i);
        }
        
    }
}
