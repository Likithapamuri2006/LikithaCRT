/*Set:
    *it is the pre defined interface-->java.util
    *jdk 1.2
    *we have 3 implementation classes-->Hashset,LinkedHashset,Treeset
specification:
   *insertion order will not be maintained.
   *Dulicates are not allowed.
   *not indexbased
   *Null values can be stored 

HashSet:
   *It is the pre defined class which is present inside java.util -->jdk 1.2
   *Underline datastructure will be Hash table 
   *initial capacity is 16
   *Fill ratio/Load factor-->75%-->16+12
*/
import java.util.*;
public class ExampleforSet {
    public static void main(String[] args) {
        Set s=new HashSet<>();
        Set s1=new LinkedHashSet<>();
        Set s2=new TreeSet<>();

        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(40);

        System.out.println(hs);

        System.out.println("--------------------------");
        System.out.println(hs.size());
        System.out.println("--------------------------");
        System.out.println(hs.isEmpty());
        System.out.println("---------------------------");
        System.out.println(hs.clone());
       for(Object obj:hs){
        System.out.println(obj);
       }
    }
}
