package studyself;

import java.util.Scanner;

public class RepeatedTwiceElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count=0;
        for (int i :nums) {
            for(int j :nums){
                if(i==j){
                    count++;
                }
                }
            if(count<2){
                System.out.println(i);
            }
          count=0;
        }

        //2. way
        //  Arrays.sort(nums);
        //    for (int i = 0; i < nums.length; i++) {
        //            if(i!=nums.length-1 && nums[i]==nums[i+1]){
        //              i++;
        //            }else{
        //              System.out.println(nums[i]);
        //            }
        //    }
    }
}
