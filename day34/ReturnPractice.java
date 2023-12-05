package day34;

public class ReturnPractice {
    public static void main(String[] args) {
        // what is return keyword is used
        //
        //break VS return
        //break ---->> loop: break out of the loop
                //---> switch : break out of case
                // ---> can we use it to exit method ?? NOO!!!!
        // return --->> inside a method
            // return the value out of a method with return type
        // the moment the return keyword is reached it wiill terminate the method
        // Can it be used in valid method ??
              // Yes BUT ONLY IN THIS WAY : return ;
        //What is the benefit of using in void method
        // to terminate the method early
        print4CharacterLengthName("Jon");
        print4CharacterLengthName("Java Shark");

    }
    public static void print4CharacterLengthName(String name){
        // if the name has less than 4 chars , get out of the method
        if(name.length()<4){
            System.out.println("INVALID NAME!!!");
           return;  // this return is being used to get out of the method early
        }
        System.out.println(name);
    }
}
