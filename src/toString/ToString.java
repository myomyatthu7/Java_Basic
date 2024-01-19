package toString;

public class ToString {

    public static void main(String[] args) {
        //Student student = new Student("Mg Mg",15);
        //System.out.println(student);
        System.out.println(new Student("Mg Mg",15));
    }
}
class Student {
    String name;
    int age;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        //return super.toString();
        return "My name is "+name+" Age is "+age;
    }

    public static void task() {
        System.out.println("Name is Mg Mg");
    }
}
