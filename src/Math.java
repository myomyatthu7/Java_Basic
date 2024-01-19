import javax.swing.*;

public class Math {


    public static void main(String[] args) throws InterruptedException {
        int num1 = 102; // 0မှ အကွာအဝေး
        int num2 = 105; // 0မှ အကွာအဝေး
        float fl = 102.4f; // 0မှ အကွာအဝေး
        System.out.println(java.lang.Math.abs(fl)); // 102.4
        System.out.println(java.lang.Math.ceil(fl)); // 103 // ဒသမ အထက်
        System.out.println(java.lang.Math.floor(fl)); // 102 // ဒသမ အောက်
        System.out.println(java.lang.Math.round(fl)); // 102
        System.out.println(java.lang.Math.max(num1, num2)); // 105
        System.out.println(java.lang.Math.min(num1, num2)); // 102
        int power = 2;
        System.out.println(java.lang.Math.pow(num1, power)); // 10404.0
        System.out.println("+++++++++++++++++++++++++++++++++++++");
//        for (int i = 0; i< 99;i++) {
//            System.out.println((int) (java.lang.Math.random()*100)+1);
//        }
        random();
    }
    public static void random() throws InterruptedException {
        double result = 0;
        int resultInt = 0;
        Math math = new Math();
        String maxStr = JOptionPane.showInputDialog("Enter your Max number 1 to 99!");
        int maxInt = Integer.parseInt(maxStr);
        for (int i = 0; i <=1 ; i++) {
            //java.lang.Math.random();
            resultInt = (int) (java.lang.Math.random() * 100);
        }
            boolean running = true;
            while (running)
                if (resultInt > maxInt) {
                    for (int x = 0; x <1 ; x++) {
                        //java.lang.Math.random();
                        resultInt = (int) ((java.lang.Math.random()*100));
                        //System.out.println("==>"+resultInt);
                    }
                } else if (resultInt == 0) {
                    math.showMessage(++resultInt);
                    running = false;
                } else {
                    math.showMessage(resultInt);
                    running = false;
                }
    }
    public void showMessage(int lucky) throws InterruptedException {
        for (int s =1; s<=5; s++) {
            System.out.println(s);
            Thread.sleep(1000);
        }
        JOptionPane.showMessageDialog(null,"Lucky Number => "+lucky);
    }
}
