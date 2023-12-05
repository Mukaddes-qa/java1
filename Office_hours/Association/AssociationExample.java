package Office_hours.Association;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Student {

    String studentName;

    public Student(String studentName){
        this.studentName = studentName;// this is for calling instance variable initialized local variable
    }
    @Override
    public String toString(){  // we overridding this method from object class
        return studentName;
    }
}
class School{
    String schoolName;
    List<Student> AllStudentsList;

    public School(String schoolName, List<Student> AllStudentList){
        this.schoolName = schoolName;
        this.AllStudentsList = AllStudentList;
    }
    public void AddNewStudent(Student student){
        this.AllStudentsList.add(student);
    }
    public void AddNewStudent( Student[] students ){
        this.AllStudentsList.addAll( Arrays.asList(students)   );
    }
    public void AddNewStudent(List<Student> listOfStudents){
        this.AllStudentsList.addAll( listOfStudents );
    }
    public String toString(){
        return ""+AllStudentsList; // " " -->why we put empty string--> easy way to concatenation String
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Hasan"); // object created existing constructor
        System.out.println( s1 ); //if ToString method created it gives name if not it gives hashcode
        System.out.println(s1.studentName);

        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Sumeyye");
        Student s5 = new Student("Parvin");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5) );

        School cybertek = new School("Cybertek", list);
        cybertek.AddNewStudent( new Student("Irina") );
        cybertek.AddNewStudent( new Student("Denis"));
        Student[] students =  {
                new Student("Gulnaz") ,
                new Student("Rukhshona")
        };
        cybertek.AddNewStudent(students);

        System.out.println( cybertek.AllStudentsList );
        //  System.out.println( cybertek.schoolName);  // Cybertek
        for( Student eachStudent   :  cybertek.AllStudentsList  ){
            System.out.println(eachStudent);
        }
        System.out.println( cybertek );
    }
}