interface Exam{ void conduct(); }
class MCQExam implements Exam{ public void conduct(){ System.out.println("Conducting MCQ Exam"); } }
class CodingExam implements Exam{ public void conduct(){ System.out.println("Conducting Coding Exam"); } }
class VivaExam implements Exam{ public void conduct(){ System.out.println("Conducting Viva Exam"); } }
public class Problem10_OnlineExam{
    public static void main(String[] args){
        Exam[] e={new MCQExam(),new CodingExam(),new VivaExam()};
        for(Exam x:e) x.conduct();
    }
}