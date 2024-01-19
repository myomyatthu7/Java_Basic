package inheritance;

public class Main {
    public static void main(String[] args) {
//        Boy boy = new Boy();
//        //boy.name = "Mg Mg";
//        //System.out.println(boy.name);
//        //Boy.getBoy();
//
//        Girl girl = new Girl();
//        girl.age = 14;
//        System.out.println(girl.age);
//        girl.getStudent();
//        Boy boy = new Boy();
//        Girl girl = new Girl();

//        Student [] stu =  {new Boy(),new Girl()};
//        for (int i=0;i<20;i++) {
//            switch (i%2) {
//                case 0 -> {
//                    System.out.println(((Boy)stu[0]).name);
//                }
//                case 1 -> {
//                    System.out.println(((Girl)stu[1]).name);
//                }
//            }

         Student [] stu = {new Boy(),new Girl()};
         for (int i = 0; i<20 ;i++) {
             switch (i%2) {
                 case 0 -> System.out.println(((Boy) stu[0]).name);
                 case 1 -> System.out.println(((Girl) stu[1]).name);
             }
         }

        Boy s1 = new Boy();
        Girl s2 = new Girl();

        Boy b1 = s1;
        Girl g1 = s2;

        //Boy b3 = (Boy) new Student();

        System.out.println(b1.name);
        System.out.println(g1.age);

        System.out.println(s1.trouserColour);
        System.out.println(s2.skirtColour);
    }
}
