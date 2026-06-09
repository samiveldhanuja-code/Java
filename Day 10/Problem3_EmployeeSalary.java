class Employee{
    private String name;
    Employee(String name){ this.name=name; }
    double calculateSalary(){ return 0; }
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(){ super("FT"); }
    double calculateSalary(){ return 50000; }
}
class PartTimeEmployee extends Employee{
    PartTimeEmployee(){ super("PT"); }
    double calculateSalary(){ return 20000; }
}
class Intern extends Employee{
    Intern(){ super("Intern"); }
    double calculateSalary(){ return 10000; }
}
public class Problem3_EmployeeSalary{
    public static void main(String[] args){
        Employee[] e={new FullTimeEmployee(),new PartTimeEmployee(),new Intern()};
        for(Employee x:e) System.out.println("Salary: "+x.calculateSalary());
    }
}