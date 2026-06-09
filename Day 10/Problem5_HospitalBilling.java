class Patient{
    protected double calculateBill(){ return 0; }
}
class InPatient extends Patient{
    protected double calculateBill(){ return 5000; }
}
class OutPatient extends Patient{
    protected double calculateBill(){ return 1000; }
}
public class Problem5_HospitalBilling{
    public static void main(String[] args){
        Patient[] p={new InPatient(),new OutPatient()};
        for(Patient x:p) System.out.println("Bill: "+x.calculateBill());
    }
}