package Office_hours;

public class ScrumTeamEmployees {
    // Scrum team employees's information --->variable
    //SM, PO, developers + testers
    String jobTitle;
    String names;
    double salary;
    int employee_ID;
    int age;

    // what can scrum team do ?actions ---> method
    public void standUp(){
        System.out.println("This team's stand up meeting is at 10:45 AM ");
    }
    // create a method whic give me all the information about employee
    public void getEmployeeInfo(){
            System.out.println("Job Title: "+ jobTitle + "/" +
                    "Employee ID: "+  +employee_ID + "/" +
                    "Name: " + names +  "/" +
                    "Salary: " + salary + "/" +
                    "Age: " +age);

    }


    public static void main(String[] args) {
        System.out.println("hello world");

        int i=9;
        String word ="java";// local variable
    }
    public void hi(){
        String name ="Asiya"; // local variable
    }
    public void hello(String name ){
        System.out.println("Hello " + name); // local variable
    }
}
