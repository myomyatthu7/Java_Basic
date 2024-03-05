package abstrac;

class Main extends Shape {
        public static void main(String[] args) {
                Animal animal; // allow you can create reference of abstract class.
                // new Animal(); // Not allow you can't create object of abstract class;
                // animal.eat();
                Animal animal1 = new Dog();
                animal1.run();
                animal1.eat();
                //animal1.name
                Dog dog = new Dog();
                System.out.println("==================================");
                dog.run();
                dog.eat();
                // new Shape().name // cannot be instantiated

                Main main = new Main();
                // System.out.println(new MyVar().name);// Abstract class use as a base for subclass.
                System.out.println(main.name);
                main.task();
                main.doIt();
        }

        @Override
        public void doIt() {
                System.out.println("I can do it!");
        }
}
