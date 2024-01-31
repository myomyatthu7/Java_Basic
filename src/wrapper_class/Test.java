package wrapper_class;

public class Test {

    public static void main(String[] args) {

        // Primitive data type
        int primitiveInt = 10;

        // Wrapper class
        Integer wrapperInt = 10; // Autoboxing (converting primitive to wrapper)
        int intValue = wrapperInt; // Unboxing (converting wrapper to primitive)


        int x = 99;
        Integer y = 88;
        Number q = 55;
        String w = String.valueOf(q);
        String z = y.toString();
        String t = String.valueOf(y);
        String num = Integer.toString(x);
        String num1 = String.valueOf(x);
        System.out.println(z);


    }
}
