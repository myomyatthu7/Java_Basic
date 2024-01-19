package Class;

public class Constructor {
    public String name = "Su Su";
    public Constructor() {
        System.out.println("I am Constructor!");
    }
    //Constructor overloading
    public Constructor(String name) {
        // String name = "";  already defined in the scope.
        System.out.println("My Constructor name is "+name);
        System.out.println("My Class name is "+this.name);
        this.name = name;
        System.out.println("Reassign name is "+this.name);
        System.out.println("____________________________");
    }
    public Constructor(String name,int age) {
        System.out.println("My name is "+name+" Age is "+age);
    }
}
