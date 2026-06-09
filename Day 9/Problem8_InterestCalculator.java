interface Account{ void showInterest(); }
class SavingsAccount implements Account{
    public void showInterest(){ System.out.println("Savings Interest: 4%"); }
}
class FixedDeposit implements Account{
    public void showInterest(){ System.out.println("FD Interest: 7%"); }
}
class RecurringDeposit implements Account{
    public void showInterest(){ System.out.println("RD Interest: 6%"); }
}
public class Problem8_InterestCalculator{
    public static void main(String[] args){
        Account[] a={new SavingsAccount(),new FixedDeposit(),new RecurringDeposit()};
        for(Account x:a) x.showInterest();
    }
}