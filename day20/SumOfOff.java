package day20;

public class SumOfOff {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i = 10; i <100 ; i++) {
            if(i%2!=0){
                sum=sum+i;
                count+=1;

            }
        }
        System.out.println(count);
        System.out.println("sum of :"+ sum);
    }
}
