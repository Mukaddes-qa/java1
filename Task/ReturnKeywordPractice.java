package Task;


public class ReturnKeywordPractice {
    public static void main(String[] args) {

        System.out.println("My age = " + calculateAndReturnAge(1986));
     int [] birthYear= {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};
     for(int eachYear : birthYear){
      System.out.println("Age = " + calculateAndReturnAge(eachYear));
  }

    }
    public static int  calculateAndReturnAge( int birthYear ){
        if(birthYear<=1900 || birthYear>=2020){
            return 0;
        }
        return 2019-birthYear;
    }
}
