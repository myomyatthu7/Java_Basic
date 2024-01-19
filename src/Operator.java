public class Operator {

    public static void main(String[] args) {
            /*
        Arithmetic Operator
        Assignment Operator
        Comparison Operator
        Ternary Operator
        Logical Operator
         */
        /*
        Arithmetic Operator
        Addition +
        Subtraction -
        Multiplication *
        Division /
        Modulus %
        Increment/decrement ++a,--b
         */
        int a = 4;
        int b = 8;
        //int add = a % b;
        //a++;
        //System.out.println("Sum of a + b :" + add);
        //System.out.println(--a);

        /*
        Assignment Operator
        Addition +=
        Subtraction -=
        Multiplication *=     Assignment
        Division /=
        Modulus %=
         */
        a %= 4;
        //System.out.println(a);
        /*
        Comparison Operator / Relational Operator = Boolean
        ==
        !=
        <
        <
         */
        int q = 6;
        int w = 3;
        Boolean bol = q >= 6;
        //System.out.println(bol);

        /*
        Ternary Operator
        ?:
         */
        int t = 6;
        //expression ? true : falue
                String result = t > 7 ? "t is greater than seven" : "t is less than seven";
        //System.out.println(result);

        /*
        Logical Operator
        and &&
        or ||
        not !
         */
        int i = 6;   // &&  // ture && true
                      // || // one true
        Boolean bols = i > 5 && i == 7;
        bols = !bols;

        System.out.println(bols);
    }
}
