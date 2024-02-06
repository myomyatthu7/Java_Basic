package thread.runnable;

public class Demo {
    // we can use extend and multilevel inheritance;
    public static void main(String[] args) {
        Runnable obj1 = new X();
        Runnable obj2 = new Y();

        Thread th1 = new Thread(obj1);
        Thread th2 = new Thread(obj2);
        th1.start(); // Runnable have not start method
        th2.start();
    }
}
class X implements Runnable {
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Y implements Runnable {

    public void run() {
        for (int i=0;i<100;i++)  {
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
