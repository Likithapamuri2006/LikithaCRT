/*Linkedhashmap:
   *it is predefined class in java.util
   *jdk 1.4
   *insertion order is maintained
   *underlined DS will be in Linkedlist and Hashtable

*/
import java.util.*;
public class ExampleforLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Object> m=new LinkedHashMap<String,Object>();//LinkedHashmap lhm=new LinkedHashMap();
        m.put("name","abc");
        m.put("age",21);
        System.out.println(m);
        System.out.println("-------------------");
        System.out.println(m.get(0));
        System.out.println("-------------------------");
        for(Object i:m.keySet()){
            System.out.println(i);
        }
        System.out.println("--------------------");
        for(Object i:m.entrySet()){
            System.out.println(i);
        }
    }
}