package enumember;

public class User {
    private String name;
    private  Enum type;

    public User(String name, Enum type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Enum getType() {
        return type;
    }
}
