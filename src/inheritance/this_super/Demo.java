package inheritance.this_super;


// inheritance + constructor
public class Demo {
    public static void main(String[] args) {
        B b = new B(2);
    }
}
class A {
    public A() {
        System.out.println("default A");
    }
    public A(int a) {
        System.out.println("Int A");
    }
}

class B extends A {
    public B() {  // every constructor have super();
        System.out.println("default B");
    }
    public B(int b) {
        super(3); // don't want to call default of super,parse value;
        System.out.println("Int b");
    }
}