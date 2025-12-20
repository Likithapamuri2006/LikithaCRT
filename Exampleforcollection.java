import java.util.*;
/*Arraylist-->
    It is a predifined class -->java.util-->jdk 1.2 
    Specification:
    -->Initial capacity is 10
    -->incremental capacity is ((Currentcapacity*3)/2)+1
    -->underlined Datastructure-->Resizable array
    
    
    */
public class Exampleforcollection {
   public static void main(String[] args) {

    List<Integer> l=new ArrayList<>();
    l.add(10);
    l.add(20);
    l.add(30);
    System.out.println("List:"+l);
    System.out.println("------------------------------------");
    ArrayList<Integer> a1=new ArrayList<>();
    a1.add(10);
    a1.add(30);
    a1.add(40);
    System.out.println("ArrayList"+a1);

   } 
}
