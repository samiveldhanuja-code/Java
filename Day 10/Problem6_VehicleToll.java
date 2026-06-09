class Vehicle{
    double toll(){ return 0; }
}
class Car extends Vehicle{
    double toll(){ return 100; }
}
class Bus extends Vehicle{
    double toll(){ return 200; }
}
class Truck extends Vehicle{
    double toll(){ return 300; }
}
public class Problem6_VehicleToll{
    public static void main(String[] args){
        Vehicle[] v={new Car(),new Bus(),new Truck()};
        for(Vehicle x:v) System.out.println("Toll: "+x.toll());
    }
}