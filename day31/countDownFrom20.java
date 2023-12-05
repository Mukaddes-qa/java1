package day31;

public class countDownFrom20 {
    public static void main(String[] args) {
        countDownNumbers();
        oddNumbers();
        spellName();

        }
        public static void countDownNumbers(){
            for (int i =20; i >0 ; i--) {
                System.out.print(i + " ");
            }
        }
        public static void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
     }
        public static  void spellName(){
            String name= "Mukaddes";
            for (int i = 0; i <name.length() ; i++) {
                System.out.print(name.charAt(i)+ "-");
            }
        }
    }




