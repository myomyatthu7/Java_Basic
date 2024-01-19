package enumember.test;

import enumember.Main;

import javax.swing.*;

public class Test {
    User user1 = new User("Mg Mg",MemberAccess.Silver);
    User user2 = new User("Aung Aung",MemberAccess.Gold);
    User user3 = new User("Su Su",MemberAccess.Platinum);
    User user4 = new User("Nu Nu",MemberAccess.Diamond);

    public static void main(String[] args) {
        for (Car car : Car.values()) {
            System.out.println(car+" price is "+car.getPrice()+" Model is " + car.getModel());
        }

    }
}
enum MemberAccess {
    Silver,Gold,Platinum,Diamond;
}
class User {
    private final String userName;
    private final Enum type;


    User(String userName, Enum type) {
        this.userName = userName;
        this.type = type;
    }
    public String getName() {
        return userName;
    }
    public Enum getType() {
        return type;
    }
}
enum Car {
    swift(200,2016),
    toyota(350,2017),
    Mercedes(1200,2018),
    Ford(1100,2017),
    Chevrolet(1000,2016);

    private final int model;
    private final int price;

    Car(int price, int model) {
        this.price = price;
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public int getModel() {
        return model;
    }
}
