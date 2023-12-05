package Task;

import org.w3c.dom.ls.LSOutput;

public class MethodTasks {
    public static void main(String[] args) {
        reversePrintMyOwnName("Mukaddes");
        reversePrintAnyName("CYBERTEK");
        printLastCharacterOfName("MUKADDES");
        printFullNameInformation("Mukaddes", "Kaygusuz");
        compareNameCharacterCount("MUKADDES", "KAYGUSUZ");
        print();
        printReverse();

    }

    public static void reversePrintMyOwnName(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void reversePrintAnyName(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void printLastCharacterOfName(String name) {
        System.out.print("My name is last character : " + name.charAt(name.length() - 1));
        System.out.println();
    }

    public static void printFullNameInformation(String firstName, String lastName) {
        System.out.println("My first name is : " + firstName + " \n" + "My last name is : " + lastName);
        System.out.println();
        String lengthOfTheFullName = (firstName + lastName);
        System.out.println("My full name length of : " + lengthOfTheFullName.length());
        System.out.println();
    }

    public static void compareNameCharacterCount(String name1, String name2) {
        if (name1.length() > name2.length()) {
            System.out.println("name1 is longer");
        } else if (name1.length() < name2.length()) {
            System.out.println("name2 is longer");
        } else {
            System.out.println(" name 1 and name 2 same character count ");

        }
        System.out.println();
    }

    public static void print() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printReverse() {
        for (char x = 'Z'; x >= 'A'; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void printAlphabetInRange (char beginning, char ending){
        System.out.println();
    }

}

