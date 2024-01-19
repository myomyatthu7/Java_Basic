package abstrac;

import inheritance.Boy;

public class Test {
    public static void main(String[] args) {
        Robot ro = new Robot();
        //ro.getName("Robot");
        ro.getTask();
        System.out.println(ro.name);
    }
}
abstract class Machine {
    String name = "Machine";
    int id;

    public void setName(String name) {
        this.name = name;
        System.out.println(name+" Method");
    }
    abstract public
    void getTask();  //abstract method don't be static
}

class Robot extends Machine {
    @Override
    public void getTask() {
        System.out.println("Robot is tasking");
    }
}