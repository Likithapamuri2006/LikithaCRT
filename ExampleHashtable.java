
import java.util.Hashtable;
public class ExampleHashtable {
    public static void main(String[] args) {
        Hashtable<String,Object> ht=new Hashtable<String,Object>();
        ht.put("Name","likki");
        ht.put("Age",25);
        ht.put("Email","likki123@gmail.com");

        System.out.println(ht);
    }
}
