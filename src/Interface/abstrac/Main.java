package Interface.abstrac;

public class Main extends Shape {
    public static void main(String[] args) {
        new Main().click("Java");
        Shape shape = new Main();
        shape.count(1);
    }

    @Override
    public void click(String click) {
        System.out.println("Click :"+click);
    }

    @Override
    public void count(int count) {
        System.out.println("Count :"+count);
    }
}
