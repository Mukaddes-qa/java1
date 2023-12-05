package Office_hours;

public class Teacher {
    private String name;
    private int age;

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
     //   t1.setName("Swetlana");
       // t1.setAge(19);
        t1.initializedFields("Nuran",18);

        System.out.println("t1.getName() = " + t1.getName());
        System.out.println("t1.getAge() = " + t1.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public void initializedFields(String name, int age){
        //this.name= name;
        // this.age=age;
        setName(name);
        setAge(age);

    }
}