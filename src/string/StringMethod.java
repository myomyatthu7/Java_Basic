package string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMethod {


    public static void main(String[] args) {
        String moto = "what you decide to do,make sure it make you happy.";
        String str = "0123456789";
        System.out.println(moto.charAt(5)); // y  // index
        System.out.println(moto.length()); //50
        System.out.println(str.substring(7)); // 789
        System.out.println(str.substring(2,7)); // 23456 // နောက်ဆုံးက တစ်လျော့
        System.out.println(moto.contains("w") || moto.contains("what")); // true
        String str1 = "012345678";
        System.out.println(str.equals(str1)); // true // variable(obj) ချင်းချိန်ညှိတာ
        System.out.println(str.isEmpty()); // true //
        System.out.println(str.isBlank()); // true //
        System.out.println(str.concat(moto)); // 0123456789what you decide to do,make sure it make you happy.v
        System.out.println(moto.replace('a','@')); // wh@t you decide to do,m@ke sure it m@ke you h@ppy.
        System.out.println(moto.replace("what","what!!!")); // what!!! you decide to do,make sure it make you happy.
        String name = "Mg Mg";
        String name2 = "Mg MG";
        System.out.println(name.equalsIgnoreCase(name2)); // true
        String [] str2 = moto.split(" ");
        System.out.println("______________________________________________");
        String moto1 = "what you decide to do,make sure it,make you happy.";
        String [] str3 = moto1.split(",",3);
        for (String strr : str3) {
            System.out.println(strr); //what you decide to do
//                                    make sure it
//                                    make you happy.
        }
        System.out.println(str3.length); // 3
        System.out.println(Arrays.toString(str2)); // [what, you, decide, to, do,make, sure, it, make, you, happy.]
        //System.out.println(name.intern());
        System.out.println(moto.indexOf('y')); // 5
        System.out.println(moto.indexOf("decide")); // 9 စလုံးအစရဲ့ index No
        System.out.println(moto.toLowerCase()); //
        System.out.println(moto.toUpperCase()); //
        String name3 = " Mg Mg";
        System.out.println(name.length());;
        System.out.println(name3.length());
        name3 = name3.trim();               // delete white space
        System.out.println(name3.length());
        int i = 10;
        String x = String.valueOf(i);
        System.out.println("i was changed String "+x); // i was changed String 10
        if (name.equals(name3))
            System.out.println("Name is equal name3"); // because of Trim()
         else  System.out.println("Name is equal name3");

         boolean bol1 = name3.startsWith("M");
         boolean bol2 = name3.endsWith("G");
        System.out.println(bol1); // true
        System.out.println(bol2); // false // capital letter

        String name4 = "Mg MG";
        // Lexicographically
        int minusZeroPlus1 = name.compareTo(name4);
        int minusZeroPlus2 = name.compareToIgnoreCase(name4);
        System.out.println("Compare to "+minusZeroPlus2); // IgnoreCase
        System.out.println("Compare to "+minusZeroPlus1); // Compare to 32 //
        // if it is + value,name is greater,it is -, name 4 is greater
        //if it is 0,it is equal.
        boolean bol3 = name3.contentEquals(name4);
        System.out.println(bol3); // false

        //String str4 = "";
        String str4 = String.join("/","One","Two","Three","Four");
        System.out.println(str4); // One/Two/Three/Four

        ArrayList<String> str5 = new ArrayList<>();
        str5.add("One");
        str5.add("Two");
        str5.add("Three");
        str5.add("Four");
        String arrayList = String.join("|",str5);
        System.out.println(arrayList);  // One|Two|Three|Four

        String str6 = "HelloJava";
        for (int a = 0;a< str6.length(); a++) {
            char chr = str6.charAt(a);
            System.out.print((int) chr+"\t"); // 72	101	108	108	111	74	97	118	97
        }
    }
}
