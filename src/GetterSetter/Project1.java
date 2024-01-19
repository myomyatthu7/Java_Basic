package GetterSetter;

public class Project1 {
    private String name, city, car;
    private int age;
    private double height;

    public Project1(String name,int age,String city,String car, double height ) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.city = city;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCar() {
        return car;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
