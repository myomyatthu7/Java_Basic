package scanner;
public class Scanner {
     public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
       // int num = scanner.nextInt();
       // String name = scanner.nextLine();

       // System.out.println(num);
       // System.out.println(name);
        int i = 0;
        int total = 0;
        while (i<2) {
            total += scanner.nextInt();
            i++;
        }
        System.out.println(total);
    }
}
