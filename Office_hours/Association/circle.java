package Office_hours.Association;

import day52.Polymorpisim.Circle;

class circle {
     public  double radius;
     public  circle(double radius){
         this.radius=radius;
     }
     @Override
     public  boolean equals(Object O) {
return true;
     }
}


class TestCircle{
    public static void main(String[] args) {
        circle c1= new circle(3.5);
        circle c2 = new circle(3.5);
        System.out.println();
    }
}