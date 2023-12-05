package Office_hours.POLY;

public abstract class ScrumTeam {
    public String employeeName;
    public String JobTitle;
    public  double salary;

    public  abstract  void Demo();
    public  abstract  void DailyStandUp();

    public void getEmployeeInfo(){
        System.out.println("Employee Name" + employeeName);
        System.out.println("Job title: " + JobTitle);
        System.out.println("Salary" + salary);
    }
}
