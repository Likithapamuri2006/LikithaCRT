class plane{
    void takeoff(){
        System.out.println("plane taking off");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landing");
    }   
}
class Cargo extends plane{
    void fly(){    //overriding  method
        System.out.println("Cargoplane is flying at low height");
    }
    void specialCargo() {   //specialized method
        System.out.println("cargoplane carries cargo");
    } 
}
class Passanger extends Cargo{
    void land(){
        System.out.println("Cargo landed safely");
    }
    void gone(){
        System.out.println("cargo was gone");
    }
}
class Flighter extends Passanger{
    void takeoff(){
       System.out.println("takeoff safely");
    }
    void clash(){
        System.out.println("flight was crashed");
    }
}

public class Methodsofinheritance {
    public static void main(String[] args) {
        Flighter cp=new Flighter();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.specialCargo();
        cp.gone();
        cp.clash();
    }
}
