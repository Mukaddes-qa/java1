package Office_hours;
// write a method that can calculate grade
//					if score is 100 ~ 90 ==> A
//					if score is 89 ~ 80 ==> B
//					if score is 79 ~ 70 ==> C
//					if score is 69 ~ 60 ==> D
//					if score is 0 ~ 59 ==> F
//					otherwise ==> Invalid Score
public class GradeParameters {
    public static void main(String[] args) {
        CalculateGrade(65);
    }
    public static void CalculateGrade(int score){
        if(score<=100 && score>=90){
            System.out.println("A");
        }else if (score<=89 && score>=80)
            System.out.println("B");
        else if (score<=79 && score>=70)
            System.out.println("C");
        else if (score<=69 && score>=60)
            System.out.println("C");
        else if (score<=59 && score>0)
            System.out.println("F");
        else
            System.out.println("Invalid Score");
    }
}
