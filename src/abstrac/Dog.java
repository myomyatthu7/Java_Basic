package abstrac;

class Dog extends Animal {
    @Override
    public void eat() {
        //super.eat();
        System.out.println("Dog is eating");
    }

    @Override
    void run() {
        System.out.println("Dog is run");
    }
}
