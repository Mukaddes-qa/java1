package day50.shape;


import day51.Flyable;

// Flyable is super type of UprightFlyable
// Flyable is more general , UprightFlyable is slightly less general but still abstract idea
interface UprightFlyable extends Flyable {

    //    public abstract void fly();
    public abstract void flyUpright();

}
