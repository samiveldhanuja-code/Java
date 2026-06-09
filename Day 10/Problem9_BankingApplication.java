class Account{
    private double balance;
    Account(double balance){ this.balance=balance; }
    double calculateInterest(){ return 0; }
}
class SavingsAccount extends Account{
    SavingsAccount(){ super(10000); }
    double calculateInterest(){ return 400; }
}
class CurrentAccount extends Account{
    CurrentAccount(){ super(10000); }
    double calculateInterest(){ return 200; }
}
public class Problem9_BankingApplication{
    public static void main(String[] args){
        Account[] a={new SavingsAccount(),new CurrentAccount()};
        for(Account x:a) System.out.println("Interest: "+x.calculateInterest());
    }
}