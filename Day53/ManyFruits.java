package Day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {
    public static void main(String[] args) {
        Apple a1= new Apple("sweet","red","Fuji");
        Fruit f1 = a1;
        Fruit f2= new Apple("crispy but tasteless", "hot red","Gala");
        Fruit f3= new Orange("sour","orange",12);
        Fruit f4 =new Orange("very sweet","Blood Red", 10);

        Fruit[] muFruits = {f1,f2,f3,f4};
        for(Fruit each:muFruits){
            each.getDigested();
        }
        System.out.println("----------------------------------------");
        // in this way , it is not resizable adding removing will not work everthing else
       // List<Fruit> fruitList= Arrays.asList(f1,f2,f3,f4);
        List<Fruit> fruitList =  new ArrayList<>(Arrays.asList(f1,f2,f3,f4));
        for(Fruit each: fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class type = " + each.getClass().getSimpleName());
        }

    }
        
    }

