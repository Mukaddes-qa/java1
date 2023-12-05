package Office_hours.Polymorphisim;

public abstract class States {
    String stateName;  // every sub class has stateName
    public  void tax(){
        System.out.println("Tax rate us 5 %");
    }
    public  final void method1(){
        System.out.println("method 1 from States class");
    }
}
class Kentucky extends  States{
String stateName="KY";
    @Override
    public void tax() {
        System.out.println("Tax Rate in KY is 6% ");
    }
    public  void KFC(){
        System.out.println("Kentucky has KFC");
    }
    public final void method1( int a){
        System.out.println("methid 1 from Kentucky");
    }
}
class California extends States{
   String stateName="CA";
    @Override
    public void tax() {
        System.out.println("Tax Rate in CA is %9");
    }
    public void Hollywood(){
        System.out.println("There is holywood in CA");
    }
    public final void method1(int a){
        System.out.println("method 1 from California");
    }
}
