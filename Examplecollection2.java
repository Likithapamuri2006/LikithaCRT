import java.util.*;

public class Examplecollection2 {
   public static void main(String[] args) {

    List<Integer> l=new ArrayList<>();
    l.add(10);
    l.add(20);
    l.add(30);
    System.out.println("List:"+l);
    for(Object i:l){
        System.out.println(i);
    }


    System.out.println(l.size());
    System.out.println(l.contains(10));
    System.out.println(l.get(1));

    for(int i=1;i<=l.size()-1;i++){
        System.out.println(l.get(i));
    }
    System.out.println("------------------------------------");
    ArrayList<Integer> a1=new ArrayList<>();
    a1.add(10);
    a1.add(30);
    a1.add(40);
    System.out.println("ArrayList"+a1);

   } 
}
