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
        switch (age) {
            case 10 -> System.out.println("Age is 10");
            case 12 -> System.out.println("Age is 12");
            case 13 -> System.out.println("Age is 13");
            default ->
                System.out.println("I dont know");
        }
        System.out.println("=================");

        // return value
        String result = switch (age) {
            case 10,11 -> "Age is 10,11";
            case 12 -> "Age is 12";
            case 13 -> "Age is 13";
            default -> "default";
        };
        System.out.println(result);

        String info = switch (age) {
            case 10,11 : yield  "Age is 10,11";
            case 12 : yield "Age is 12";
            case 13 : yield "Age is 13";
            default : yield "default";
        };
        System.out.println(info);
    }
}
