package studyself;

public class LongestShortestWord {
    public static void main(String[] args) {
        String[] flowers = new String[]{"Jasmine","Bluebell","Lilac","Poppy","Chamomile"};

        for(String each:flowers){
            System.out.print(each + " * ");
        }
        // Longest Word
        String longest=flowers[0];
        for (String each:flowers){
            if(each.length()>=longest.length());
            longest=each;
        }
        System.out.println("Longest words in Flowers : " + longest);
         // Shortest Word
        String shortest=flowers[0];
        for (String each:flowers){
            if(each.length()<shortest.length());
            shortest=each;
        }
        System.out.println("Shortest words in Flowers : " + shortest);

        // reverse
        for (int i = flowers.length-1; i>=0 ; i--) {
            System.out.print( flowers[i] + " " );
        }



        //Last Word
        int size=flowers.length;
        int lastItem = size-1;
        String lastItemValue= flowers[lastItem];
        System.out.println("last item is : " + lastItemValue);

       // Middle Word
        int middle=(flowers.length/2);
        System.out.println("Middle word : " + flowers[middle]);
    }
}
