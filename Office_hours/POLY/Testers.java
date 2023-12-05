package Office_hours.POLY;

public class Testers extends ScrumTeam {

    @Override
    public void Demo() {
        System.out.println("Tester " + this.employeeName + " id doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester " + this.employeeName+ " is attending daily stand up meeting");
    }
    public void foundBug(){
        System.out.println("Tester " + this.employeeName+ " reported a bug");
    }
}
