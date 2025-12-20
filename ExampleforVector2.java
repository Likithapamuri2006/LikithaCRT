import java.util.*;

class Car{
    private String carname;
    private String carcolour;
    private int carprize;
public Car( String carname,String carcolour,int carprize){
        super();
        this.carname=carname;
        this.carcolour=carcolour;
        this.carprize=carprize;
    }
    public String getCarname(){
        return carname;
    }
     public String getCarcolour(){
        return carcolour;
    }
     public int carprize(){
        return carprize;
    }
    public String toString(){
        return "Car carname="+carname+"carcolour= "+carcolour+"carprize="+carprize;
    }
}


public class ExampleforVector2 {
    public static void main(String[] args) {
        Car c1=new Car("skoda","red",200000);
        Car c2=new Car("ertiga","black",3000000);

        Vector<Car> v=new Vector<Car>();
        v.add(c1);
        v.add(c2);
        for(Object obj:v){
            System.out.println(obj);
        }
    }
}
