package day32;

public class CharacterActions {
    public static void main(String[] args) {
        printAtoZ();
        printZtoA();
        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
        printAlphabetInRange('a','A');
        printAlphabetInRange('Z','a');
    }
    public static void printAtoZ (){
     for(char i='A'; i<='Z'; i++){
         System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void printZtoA(){
        for (char i = 'Z'; i >= 'A' ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAlphabetInRange(char beginning, char ending){
        if(beginning<ending){
            System.out.println("WE NEED TO INCREMENT FROM--->>>" + beginning + "  till "+ ending);
            for (char i = beginning; i <=ending; i++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }else if(beginning>ending){
            System.out.println("WE NEED TO DECREMENT FROM--->>>" + beginning + " till " + ending);
            for (char i = beginning; i >=ending; i--) {
                System.out.print(i+ " ");
                }
            System.out.println();
        }else{
            System.out.println("THEY ARE SAME LENGTH!!!");
        }
        System.out.println();
    }
}
