class Ride{
    double fare(){ return 0; }
}
class BikeRide extends Ride{
    double fare(){ return 80; }
}
class AutoRide extends Ride{
    double fare(){ return 150; }
}
class CabRide extends Ride{
    double fare(){ return 300; }
}
public class Problem10_RideBooking{
    public static void main(String[] args){
        Ride[] r={new BikeRide(),new AutoRide(),new CabRide()};
        for(Ride x:r) System.out.println("Fare: "+x.fare());
    }
}