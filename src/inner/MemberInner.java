package inner;

import enumember.Main;

import javax.crypto.Mac;
import javax.crypto.MacSpi;

public class MemberInner {
    public static void main(String[] args) {

          //static method
//        Machine.Camera camera = new Machine.Camera();
//        camera.snap();

         Machine.Camera.shot(); //static method;

        // non static method
//        Machine machine = new Machine();
//        Machine.Camera camera = machine.new Camera();
//        camera.snap();

    }
}
class Machine {
    String name = "Phone";
    public void start() {
        System.out.println(name+" is working");
    }
      class Camera {  // memberInner may be static -> better
        static String appName = "B612";
        public void snap() {
            System.out.println("Snapping with "+appName);
        }
         public static void shot() {
             System.out.println("Shooting with "+appName);
         }
    }
}
