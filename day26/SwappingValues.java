package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {
       String name1 = "Emma";
       String name2="Jason";

       //name2 sholu have Emma , name1 should have Jason

       // name1=name2;
        // name1=name1;

        String tempContainer = name1;
        name1=name2; // name1--->>Jason
        name2=tempContainer;// name--->>EEmma

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        int[] myNumbers = { 10,40,80,7};
        int temp=myNumbers[0]; // temp now has 10
        myNumbers[0]=myNumbers[3]; // first item value become 7
        myNumbers[3]=temp; // last item become 10

        System.out.println("first item = " + myNumbers[0]);
        System.out.println("last item = " + myNumbers[3]);

        System.out.println("My numbers = " + Arrays.toString(myNumbers));

        // the result of swapping --->> reversed array

       // How did i come up with 0 and 3
        // How did i come up with 0+1 and --->> 3-1 = 2
    }
}
