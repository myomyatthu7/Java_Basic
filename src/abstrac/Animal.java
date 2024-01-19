package abstrac;

abstract class Animal {
    public final String name = "";
    int age;
    abstract void run();

    public void eat() {
        System.out.println("Animal is eating");
    }
}
