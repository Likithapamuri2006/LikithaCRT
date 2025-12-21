import java.util.*;
import java.util.HashSet;
class Dog{
    private String name;
    private String breed;
    Dog(String name,String breed){
    super();
    this.name=name;
    this.breed=breed;
}
public String getName(){
    return name;
}
public String getBreed(){
    return breed;
}
public String toString(){
    return "Dog[name="+ name+",breed="+ breed+"]";
}

}
public class ExampleforHashSet {
    public static void main(String[] args) {
       Dog d=new Dog("chimtu","lab");
       HashSet <Dog>hs=new HashSet<>();
       hs.add(d);
       for(Object i:hs){
        System.out.println(i);
       }

    }
}
