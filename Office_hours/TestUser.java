package Office_hours;

public class TestUser {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo();

        user1.setUserName("Alisa");
        System.out.println("User name = " + user1.getUserName());

        UserInfo user2 = new UserInfo();
        user2.setUserName("Kamran");
        System.out.println("User2 name = " + user2.getUserName());

        user1.setPassWord("ghjk");
        System.out.println("User password = " +user1.getPassWord());

        user1.setSsn("1234566");
        System.out.println("User ssn = " + user1.getSsn());
    }
}
