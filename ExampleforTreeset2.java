import java.util.*;
class Car implements Comparable<Car>{
    int cost;
    Car(int cost){
        this.cost=cost;
    }
    public  String toString(){
        return "Car[cost="+cost+"]";
    }
    public int compareTo(Car c){
        return this.cost-c.cost;
    }

}
public class ExampleforTreeset2 {
    public static void main(String[] args) {
        Car c1=new Car(300);
        Car c2=new Car(200);

        TreeSet<Car>ts=new TreeSet<>();
        ts.add(c1);
        ts.add(c2);
        for(Object i:ts){
            System.out.println(i);
        }

    }
}
