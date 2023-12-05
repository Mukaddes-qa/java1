package studyself;

public class CountSpace {
    public static void main(String[] args) {
        String name="M E R Y E M";
        int counter=0;
        for( int i=0; i<name.length(); i++ ) {
            if(name.charAt(i) == ' ' ) {
                counter++;
            }
        }
        System.out.println("Number of spaces "+ counter);

    }
}
