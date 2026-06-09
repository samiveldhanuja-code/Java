interface TaxPayer{ double calculateTax(); }
class SalariedEmployee implements TaxPayer{
    double salary=500000;
    public double calculateTax(){ return salary*0.1; }
}
class Freelancer implements TaxPayer{
    double income=400000;
    public double calculateTax(){ return income*0.15; }
}
class Report{
    static void generate(TaxPayer t){
        System.out.println("Tax = "+t.calculateTax());
    }
}
public class Problem12_TaxCalculation{
    public static void main(String[] args){
        Report.generate(new SalariedEmployee());
        Report.generate(new Freelancer());
    }
}