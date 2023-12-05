package Task;

public class SayToGoldenSentence {
    public static void main(String[] args) {
        sayToGoldenSentence();
    }
    public static void sayToGoldenSentence(){
        String sentence  ="I can't do it";
        sentence= sentence.replace("can't","can");
        for (int i = 0; i <=300 ; i++) {
            System.out.println(sentence);
        }

    }
}
