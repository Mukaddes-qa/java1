package day14;

public class TrimAndEmpty {
    public static void main(String[] args) {
        String message = "REPL IS COMING !";
        System.out.println("message character count is " + message.length());

        System.out.println(message.trim());
        //tri metod is used to take out spaces on two sides
        // not in between!!!

        message=message.trim();
        System.out.println(message);


        System.out.println("message character count is " + message.length());
        System.out.println(message.isEmpty());
    }
}
