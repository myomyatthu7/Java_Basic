package GetterSetter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Encapsulation enc = new Encapsulation(20,15);

        System.out.println(enc.getName());
        enc.setName("Su Su");
        System.out.println(enc.getName());
        enc.setAge(18);
        System.out.println(enc.getAge());
        System.out.println(enc.getWidth());
        System.out.println(enc.getHeight());
        Project1 [] project = new Project1[3];

        Project1 project11 = new Project1("Mg Mg",18,"Yangon","Toyota",4.5);
        Project1 project12 = new Project1("Su Su",17,"Mandalay","Kia",4.3);
        Project1 project13 = new Project1("Nu Nu",16,"Taunggyi","Swift",4.4);

        project[0] = project11;
        project[1] = project12;
        project[2] = project13;

//        for (int i=0; i< project.length;i++) {
//            System.out.println(project[i].getName()+"\t  |   \t"+project[i].getAge()+"\t    |   \t"+project[i].getHeight());
//        }
//        for (Project1 projects : project) {
//            System.out.println(projects.getName()+"\t   |   \t"+projects.getAge());
//        }
        int i = 0;
        while (i < project.length) {
            System.out.println(project[i].getName()+"\t   |   \t"+project[i].getAge());
            i++;
        }
    }
}
