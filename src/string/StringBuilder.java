package string;

public class StringBuilder {


    public static void main(String[] args) {
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        stringBuilder.append("What you decide to do");
        stringBuilder.append(", make sure it");
        stringBuilder.append(", make you happy");
        System.out.println(stringBuilder);

        String name1 = "Mg Mg";
        String name2 = "Aung Aung";
        System.out.printf("The two man name is %s and %s \n",name1,name2);
        float fl = 123.123456789f;
        System.out.printf("Floating point is %a\n",fl); // 0x1.ec7e6cp6 // Hex output
        System.out.printf("Any type null? (true false)\n",fl); // false
        char ch = 'c';
        System.out.printf("Character C  %c\n",ch); // Character c
        int i = 2350;
        System.out.printf("Integer D %d\n",i); // 2350
        System.out.printf("Floating point E %e\n",fl); // 1.231235e+02
        System.out.printf("Floating point F %f\n",fl); // 123.12345(9)
                                // <= if 123451to4 (1), if 123455to9 (9);
        System.out.printf("Floating point G %g\n",fl); // 123.123
        System.out.printf("Any type H %h\n",name1); // 46c65e0
        System.out.printf("None Line separator N %n",name2); // Line separator
        System.out.printf("Integer O %o\n",i); // 4456
        System.out.printf("String S %s\n",fl); // 123.12346
        System.out.printf("Integer X %x",i); // 92e

    }
}
