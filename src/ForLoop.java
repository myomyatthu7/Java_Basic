import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {
        int i = 1;
        for ( i = 1; i <=6; i++) {
            System.out.println("i value is:" + i);
        }
        int []array = {i};
        System.out.println(Arrays.toString(array));
        int x = 0;
        while (x < 5) {
            System.out.println("X is "+x);
            x++;
        }
        int y = 1;
        do {
            System.out.println("Y is " +y);
            y++;
        } while (y <4); {
            System.out.println("Y1 is "+ (y+1));
        }

        // For Each Loop

        String [] names = {"Mg Mg","Su Su","Nu Nu","Hla Hla"};
        for (String name : names) { // data Type : MyArray.MyArray
            System.out.println(name);
        }
        System.out.println("====================================");
        for (int w = 0; w < names.length; w++) {
            System.out.println(names[w]);
        }
        System.out.println("====================================");
        int name = 0;
        while (name < names.length) {
            System.out.println(names[name]);
            name++;
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int t = 0;
        do {
            System.out.println(names[t]);
            t++;
        } while (t < names.length);

        // Switch
        int u = 4;
        switch (u) {
            case 1:
                System.out.println("u is 1");break;
            case 2:
                System.out.println("u is 2");break;
            case 3:
                System.out.println("u is 3");break;
            case 4 :
                System.out.println("u is 4");break;
            default:
                System.out.println("u is not number");break;
        }
    }
}
