class Payment{
    protected void process(){ System.out.println("Processing Payment"); }
}
class CreditCardPayment extends Payment{
    protected void process(){ System.out.println("Credit Card Payment"); }
}
class UpiPayment extends Payment{
    protected void process(){ System.out.println("UPI Payment"); }
}
class NetBankingPayment extends Payment{
    protected void process(){ System.out.println("Net Banking Payment"); }
}
public class Problem4_PaymentGateway{
    public static void main(String[] args){
        Payment[] p={new CreditCardPayment(),new UpiPayment(),new NetBankingPayment()};
        for(Payment x:p) x.process();
    }
}