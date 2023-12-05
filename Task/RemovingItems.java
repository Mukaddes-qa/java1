package Task;

import java.util.Arrays;

public class RemovingItems {
    public static void main(String[] args) {
        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        System.out.println( Arrays.toString(names) );

        int y=0;
        String[] withoutItems=new String[3];
        for (int x = 0; x <names.length ; x++) {
            if(!names[x].contains("Ahmed")) {
                withoutItems[y] = names[x];
                y++;
            }
        }
        System.out.println(Arrays.toString(withoutItems));


    }
}