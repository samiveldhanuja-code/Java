interface Ticket{ void book(); }
class BusTicket implements Ticket{ public void book(){ System.out.println("Bus Ticket Booked"); } }
class TrainTicket implements Ticket{ public void book(){ System.out.println("Train Ticket Booked"); } }
class FlightTicket implements Ticket{ public void book(){ System.out.println("Flight Ticket Booked"); } }
public class Problem9_TicketBooking{
    public static void main(String[] args){
        Ticket[] t={new BusTicket(),new TrainTicket(),new FlightTicket()};
        for(Ticket x:t) x.book();
    }
}