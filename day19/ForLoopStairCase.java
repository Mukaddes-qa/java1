package day19;

public class ForLoopStairCase {
    public static void main(String[] args) {
      String star = "";

        /*star=star + "*";
        System.out.println(star);

        star=star + "*";
        System.out.println(star);

        star=star + "*";
        System.out.println(star);

        star=star + "*";
        System.out.println(star);*/
        for (int i = 1; i <=4 ; i++) {
            star+= "*";
            System.out.println(i + " " + star);

        }

    }
}
