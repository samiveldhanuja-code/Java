class Course{
    private String name;
    Course(String name){ this.name=name; }
    void showBenefit(){ System.out.println(name); }
}
class LiveCourse extends Course{
    LiveCourse(){ super("Live Course"); }
    void showBenefit(){ System.out.println("Interactive Sessions"); }
}
class RecordedCourse extends Course{
    RecordedCourse(){ super("Recorded Course"); }
    void showBenefit(){ System.out.println("Watch Anytime"); }
}
class CertificationCourse extends Course{
    CertificationCourse(){ super("Certification Course"); }
    void showBenefit(){ System.out.println("Certificate Included"); }
}
public class Problem7_OnlineLearning{
    public static void main(String[] args){
        Course[] c={new LiveCourse(),new RecordedCourse(),new CertificationCourse()};
        for(Course x:c) x.showBenefit();
    }
}