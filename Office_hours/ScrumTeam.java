package Office_hours;

public class ScrumTeam {
    public static void main(String[] args) {
        // we are going to create an object

        ScrumTeamEmployees employees01=new ScrumTeamEmployees();
        employees01.names="Hasan";
        employees01.employee_ID=123;
        employees01.jobTitle="PO";
        employees01.age=30;
        employees01.salary=200000;

        ScrumTeamEmployees employees02 = new ScrumTeamEmployees();
         employees02.names="Maya";
         employees02.jobTitle="Tester";
         employees02.employee_ID=234;
         employees02.standUp();


        ScrumTeamEmployees employees03 = new ScrumTeamEmployees();
        employees03.names="Ershat";
        employees03.jobTitle="Developer";
        employees03.employee_ID=345;
        employees03.standUp();

        System.out.println("======================");
        System.out.println("employee01's name is " + employees01.names);
        System.out.println("employee01's job title is " + employees01.jobTitle);
        System.out.println("employee01's ID is " + employees01.employee_ID);

        System.out.println("=====================");
        employees01.getEmployeeInfo();
        employees02.getEmployeeInfo();
    }
}
