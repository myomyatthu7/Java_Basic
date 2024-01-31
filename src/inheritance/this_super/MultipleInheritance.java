package inheritance.this_super;


// can't Multiple Inheritance in java.but c++ can; // ambiguity
// can Multi level Inheritance in java.
public class MultipleInheritance {
    public static void main(String[] args) {
        Y y = new Y();
        //y.showName();
        X obj = (X) new Y();
        obj.showName();
    }
}
class X {
    public void showName() {
        System.out.println("X name");
    }
}
class Y extends X {
    public void showAge() {
        System.out.println("Y age");
    }

    @Override
    public void showName() {
        //super.showName();
        System.out.println("Y name");
    }
}
class Z extends Y {
    public void showId() {
        System.out.println("Z id");
    }
}