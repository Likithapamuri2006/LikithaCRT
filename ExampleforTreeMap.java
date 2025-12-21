import java.util.*;
import java.util.TreeMap;
public class ExampleforTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Object> tm=new TreeMap<String,Object>();
        tm.put("Name","manasa");
        tm.put("age",24);
        tm.put("email","manas@271005");
        System.out.println(tm);
        for(Object obj:tm.keySet()){
            System.out.println(obj);
        }
        System.out.println("----------------------");
        for(Object obj:tm.entrySet()){
            System.out.println(obj);
        }
    }
}