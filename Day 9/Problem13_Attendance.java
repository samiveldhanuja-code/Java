interface Attendable{ void markAttendance(); }
class StudentAttendance implements Attendable{
    public void markAttendance(){ System.out.println("Student Present"); }
}
class FacultyAttendance implements Attendable{
    public void markAttendance(){ System.out.println("Faculty Present"); }
}
public class Problem13_Attendance{
    public static void main(String[] args){
        Attendable[] a={new StudentAttendance(),new FacultyAttendance()};
        for(Attendable x:a) x.markAttendance();
    }
}