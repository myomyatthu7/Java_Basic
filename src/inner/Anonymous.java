package inner;

public class Anonymous {
    public static void main(String[] args) {
        Papa papa = new Papa() {
            @Override
            public void showMyName() {
                System.out.println("I am Papa's child");
            }
        };
        papa.showMyName();
        Execute execute = new Execute() {
            @Override
            public void exe() {
                System.out.println("Execute");
            }
        };
        execute.exe();
    }
}
class Papa {
    public void showMyName() {
        System.out.println("Papa");
    }
}
class Mama extends Papa {
    @Override
    public void showMyName() {
        System.out.println("Ma Ma");
    }
}
interface Execute {
    void exe();
}