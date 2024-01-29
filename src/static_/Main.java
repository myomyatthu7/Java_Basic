package static_;

public class Main {
    public static void main(String[] args) {
        Variable va1 = new Variable();
        Variable va2 = new Variable();
        va1.name = "Nu Nu";
        va2.name = "Su Su";
        // va1.age = 20; // use for va1 obj but change all obj.
        Variable.age = 20;
        va1.showInfo();
        va2.showInfo();
        Variable.showInfo1(va1); // can use reference obj;
    }
}
class Variable {
    String name = "Mg Mg";
    static int age = 18;
    public void showInfo() {
        System.out.println(name+" : "+age);
    }
    public static void showInfo1(Variable var) {
        //System.out.println(name+" : "+age); // error ->name; name is what of obj?
        System.out.println(var.name + " : "+age);
    }
}
