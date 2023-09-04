package Abstraction;

abstract class aeroplane3{
    abstract public void takeOff();
    abstract public void fly();
    public void landing(){
        System.out.println("Plane is landing");
    }
}
class cargoplane3 extends aeroplane3{
    public void takeOff(){
        System.out.println("Cargoplane takeoff");
    }
    public void fly(){
        System.out.println("Cargoplane flies");
    }
    public void alert(){
        System.out.println("ALERT");
    }
}
class passengerplane3 extends aeroplane3{
    public void takeOff(){
        System.out.println("Passengerplane takeoff");
    }
    public void fly(){
        System.out.println("Passenger Plane flies");
    }
}
public class lauchAbs {
    public static void main(String[] args) {
        aeroplane3 ref1 = new cargoplane3();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        // Down-casting
        ((cargoplane3) ref1).alert();
        
        aeroplane3 ref2 = new passengerplane3();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();
    }
}
