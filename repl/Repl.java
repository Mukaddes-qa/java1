package repl;

    class Main {


        private static Main Utils;

        public static void main(String[] args) {

            String result = Utils.reverseLetters("..zxcv..d");
            System.out.println(result.equals("..dvcx..z")); //true

            String result2 = Utils.reverseLetters("---abmkl.o-");
            System.out.println(result2.equals("---olkmb.a-")); //true

            String result3 = Utils.reverseLetters("---abmkl.o-");
            System.out.println(result3.equals("-o.lkmba---")); //false
        }

        public static String reverseLetters(String word){

            String reverse = "";
            String finalOne = "";

            for (int i = word.length()-1; i >=0 ; i--) {

                if(Character.isLetter(word.charAt(i))){

                    reverse += word.charAt(i);
                }

            }

            int ok = 0;

            for (int i = 0; i < word.length() ; i++) {

                if(Character.isLetter(word.charAt(i))){

                    finalOne += reverse.charAt(ok);

                    ++ok;


                }else {

                    finalOne += word.charAt(i);
                }

            }

            return finalOne;



        }
}

