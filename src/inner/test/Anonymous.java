package inner.test;

import enumember.Main;

public class Anonymous {
    public static void main(String[] args) {
        Papa pa = new Papa() {
            @Override
            public void showMyName() {
                System.out.println("I am papa's child");
            }
        };
        pa.showMyName();
    }
    Execute ex = new Execute() {
        @Override
        public void exe() {
            System.out.println("Executing");
        }
    };
}

interface Execute {
    void exe();
}
class Papa {
    String name = "Papa";
    public void showMyName() {
        System.out.println(name+" Method");
    }
}
class Mama extends Papa {
    String name = "MaMa";
    @Override
    public void showMyName() {
        System.out.println(name+" Method");
    }
}
