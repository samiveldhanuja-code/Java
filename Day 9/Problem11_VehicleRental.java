interface Rentable{ void rent(); double getRate(); }
class Bike implements Rentable{
    public void rent(){ System.out.println("Bike Rented"); }
    public double getRate(){ return 100; }
}
class Car implements Rentable{
    public void rent(){ System.out.println("Car Rented"); }
    public double getRate(){ return 500; }
}
class Van implements Rentable{
    public void rent(){ System.out.println("Van Rented"); }
    public double getRate(){ return 800; }
}
public class Problem11_VehicleRental{
    public static void main(String[] args){
        Rentable[] r={new Bike(),new Car(),new Van()};
        for(Rentable x:r){ x.rent(); System.out.println("Rate: "+x.getRate()); }
    }
}