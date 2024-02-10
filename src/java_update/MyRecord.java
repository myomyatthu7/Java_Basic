package java_update;

public class MyRecord {
    public static void main(String[] args) {
        Student stu1 = new Student(1,"Mg Mg");
        Student stu2 = new Student(2,"Su Su");
        Student stu3 = new Student(2,"Su Su");
        System.out.println(stu1.name());
        stu1.show();
        // stu1.name() = "Nu Nu"; // final
        //System.out.println(stu3.equals(stu2)); // true;
    }
}
record Student(int id,String name) { // data class in Kotlin.
    static int age; // if static variable is allow
    //String city; // instance field isn't allow
    public Student(int id,String name) {
        this.id = id;
        this.name = name;
        if (id == 0) {
            throw new IllegalArgumentException();
        }
    }
    public void show() {
        System.out.println("This is show method");
    }
}