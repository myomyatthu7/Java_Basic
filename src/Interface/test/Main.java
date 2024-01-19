package Interface.test;

public class Main implements Shape {
    public static void main(String[] args) {
        Main m = new Main();
        m.click("Phone");
        Shape sp  = new Main();
        sp.count(4);
    }

    @Override
    public void click(String click) {
        System.out.println(click+"Click");
    }

    @Override
    public void count(int count) {
        System.out.println(count+"Count");
    }
}
interface Shape extends ClickEmitter, CountEmitter {

}
interface ClickEmitter {
    void click(String click);
}
interface CountEmitter {
    void count(int count);
}
