package enumember;

import ControlFlow.ForLoop;
import simpleProject.Jar;

import javax.swing.*;

public class Main {
    User user1 = new User("Mg Mg",MemberAccess.Bronze);
    User user2 = new User("Su Su",MemberAccess.Silver);
    User user3 = new User("Nu Nu",MemberAccess.Gold);

    public static void main(String[] args) {
        Main main = new Main();
//        if (main.user1.getType() == MemberAccess.Bronze) {
//            System.out.println(main.user1.getName()+" is "+ main.user1.getType().toString());
//        }
        String name = JOptionPane.showInputDialog("Enter name");
        if (main.user1.getName().contentEquals(name)) {
            System.out.println(name + " is " + main.user1.getType().toString());
        } else if (main.user2.getName().contentEquals(name)) {
            System.out.println(name + " is " + main.user2.getType().toString());
        } else if (main.user3.getName().contentEquals(name)) {
            System.out.println(name + " is " + main.user3.getType().toString());
        }

        for (Car car : Car.values()) {  //iteration
            System.out.println("Car name is "+car+". price is "+car.getPrice()+"lahk. Model is "+car.getYear());
        }
    }
}
