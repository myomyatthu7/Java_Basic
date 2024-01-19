package Class;

public class Main {
    public static void main(String[] args) {
        Square squ = new Square();
        Constructor con1 = new Constructor("Mg Mg"); //invoke
        Constructor con2 = new Constructor("Nu Nu"); //invoke
        //squ.task("MgMg");// <==
//        squ.height = 30;
//        Square.task1();
//        System.out.println(squ.height*squ.width);
//        Circle cir = new Circle();
//        float circleArea = (float) (3.142*(cir.radius)*(cir.radius));
//        System.out.println(circleArea);
       // Square squ = new Square();
        //System.out.println(Square.width);
    }

    public static void toMake() {
        Square sqrr = new Square();
        new Square().taskNonStatic("");
        sqrr.taskNonStatic("");
        Square.taskStatic();
        int widthStatic = Square.widthStatic;
    }
    public void toDo() {
        Square sqr = new Square();
        sqr.taskNonStatic("");
        Square.taskStatic();
        int heightNonStatic = sqr.heightNonStatic;
        int widthStatic = Square.widthStatic;
    }

}
