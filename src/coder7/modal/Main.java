package coder7.modal;

public class Main {

    public static void main(String[] args) {
        Student [] student = new Student[3];

        int id = 1000;

        User user1 = new User("Mg Mg","Swift",18,4.5);
        User user2 = new User("Su Su","Toyota",19,4.4);
        User user3 = new User("Nu Nu","Town-Ace",20,4.6);

        Student student1 = new Student("Yangon",id,user1);
        Student student2 = new Student("Mandalay",id,user2);
        Student student3 = new Student("NayPyiTaw",id,user3);

        student[0] = student1;
        student[1] = student2;
        student[2] = student3;

        for (Student students : student) {
            //System.out.println("Id is"+id);
            id+= 1;
            System.out.println(id +"\t |   \t"+students.getUser().getName()+"\t |   \t"+students.getUser().getHeight());
        }
    }

}
