package thread;

public class Multi_Thread {
    public static void main(String[] args) {
//        A obj1 = new A();
//        B obj2 = new B();
//        obj1.start();
//        obj2.start();
        X obj1 = new X();
        Y obj2 = new Y();
        obj1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

    }
}
class X extends Thread {
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
class Y extends Thread {
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

//class A extends Thread {
//    public void run() {
//        for (int i=0;i<1000;i++) {
//            System.out.println("Hi");
//        }
//    }
//}
//class B extends Thread {
//    public void run() {
//        for (int i=0;i<1000;i++)  {
//            System.out.println("Hello");
//        }
//    }
//}
