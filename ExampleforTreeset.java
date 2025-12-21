/*TreeSet:
   *it is also predifined class in java.util.
   *jdk 1.2 version
   *add  the elements inside the treeset and compareto().





*/
import java.util.*;
public class ExampleforTreeset {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(50);
        ts.add(30);
        ts.add(20);
        for(Object i:ts){
            System.out.println(i);
        }
    }
}
