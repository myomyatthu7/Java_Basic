package GetterSetter;

public class Encapsulation {
    private String name;
    private int age;

    public String  getName() {
        // this.name;   if return types is void,be statement
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    int width , height;

    public Encapsulation(int width, int height) { // constructor as
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
