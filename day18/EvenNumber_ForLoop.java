package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {
        for (int x =0; x<=100 ; x+=2) {
            System.out.print(x + " ");

            for (int i =0; i<=100 ; i+=2) {
                if (i%2 ==0){
                    System.out.print(i +" ");

                    for (int j = 0; j <100 ; j++) {

                            System.out.println(j + " is FIZZ BUZZ NUMBER!");
                        }

                    }

                }
            }
        }
    }
