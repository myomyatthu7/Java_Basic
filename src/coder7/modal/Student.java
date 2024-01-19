package coder7.modal;

public class Student {
     private String city;
     private int Id;
     private User user;

    public Student(String city, int id, User user) {
        this.city = city;
        Id = id;
        this.user = user;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return Id;
    }

    public User getUser() {
        return user;
    }
}
