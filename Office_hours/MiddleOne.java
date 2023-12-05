package Office_hours;

public class MiddleOne {
    public static void main(String[] args) {
        String word="abc";
        int charCount =word.length();
        if(charCount==1){
            System.out.println(word+word+word);
        }else if(charCount==2){
            System.out.println(word+word);

        }else if(charCount>2){
            //if the word character account is more than 2 then i worry about it is even or odd
            if(charCount%2==1){
                System.out.println(word.charAt(charCount/2));
            }else{
                int indexOfFirstHalf=charCount/2-1;
                int indexOfSecondaHalf=charCount/2-1;
                System.out.println(word.charAt(indexOfFirstHalf)+ " " + word.charAt(indexOfSecondaHalf));
            }

        }
    }
}
