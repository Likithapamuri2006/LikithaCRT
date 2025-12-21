/*Map:
   *predefined interface in java.util
   *jdk 1.2

   *Map is a part of collection framework which does not extends the collection framework.
   *Map is used to organize the data interms of key and value pair.
      1.keys cannot be duplicated 
      2.values can be duplicated
    *one key and value together we call it as entry
Implementation classes:
  1.Hashmap
  2.LinkedHashMap
  3.TreeMap
  4.Hashtable

  Important methods used wrt maps:
     1.put()
     2.get()
     3.clear()
     4.keyset()
*/

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("Name","likitha");
        hm.put("place","tirupati");

        System.out.println(hm);

        System.out.println("-------------------");

        System.out.println(hm.get("Name"));

        System.out.println("-------------------");

        for(Object i:hm.keySet()){
                 System.out.println(i);
        }
    }
}
