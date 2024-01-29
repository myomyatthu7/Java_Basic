package Protected;

import Protected.test.Papa;

public class Main extends Papa {
    public static void main(String[] args) {
        Mama mama = new Mama();
        System.out.println(mama.age);
        mama.task(); // non static
        Mama.doIt(); // static
        Papa papa = new Papa();
        // System.out.println(papa.name); // cannot access protected Variable // package မတူလို့
        System.out.println(papa.age);
        // papa.task(); cannot access protected method // သုံးချင်ရင် extend လုပ်သုံး
        Main main = new Main();
        main.task();
        System.out.println(main.name);
        papa.doIt();

    }


}
