package thread;

import java.util.concurrent.Semaphore;

public class Demo {
    Semaphore goA = new Semaphore(1);
    Semaphore goB = new Semaphore(0);

    public static void main(String[] args) {
        Demo demo = new Demo();
        A obj1 = demo.new A();
        B obj2 = demo.new B();
        obj1.start();
        obj2.start();
    }

    class A extends Thread
    {
        public void run() {
            for (int i = 1; i<= 100; i++) {
                try {
                    goA.acquire();
                }
                catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println("hi");
                goB.release();
            }
        }
    }

    class B extends Thread
    {
        public void run() {
            for (int i = 1; i<= 100; i++) {
                try {
                    goB.acquire();
                }
                catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println("hello");
                goA.release();
            }
        }
    }
}
