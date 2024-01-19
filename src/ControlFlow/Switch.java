package ControlFlow;

public class Switch {
    public static void main(String[] args) {
        int age = 12;
        switch (age) {
            case 10: System.out.println("Age is 10"); break;
            case 12: System.out.println("Age is 12"); break;
            case 13: System.out.println("Age is 13"); break;
            default:
                System.out.println("I dont know"); break;
        }
    }
}
