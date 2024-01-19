package inheritance;

public class Test {
    public static void main(String[] args) {
       Man m = new Man();
        System.out.println(m.name);
        m.getName();
    }
}
class Parent {
    String name = "Parent";
    public void getName() {
        System.out.println(name+"Method");
    }
}
class Man extends Parent {
    int age = 20;

    @Override
    public void getName() {
        super.getName();
        System.out.println("Child Method");
    }
}