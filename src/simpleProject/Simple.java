package simpleProject;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Simple {
    public static void main(String[] args) {
//        int total = 0;
//        for (int i = 1; i <= 5; i++) {
//            total += i;
//        }
//        System.out.println(total);

//        String[] names = new String[5];
//        for (int i = 0; i < names.length; i++) {
//            names[i] = JOptionPane.showInputDialog("Add Name!");
//        }
//        for (int s = 0; s < names.length; s++) {
//            System.out.println("Index "+s+"Name : "+names[s]);
//        }
//        System.out.println(Arrays.toString(names));

//        int []num = new int[5];
//        int total = 0;
//        for (int i = 0; i < num.length; i++) {
//            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Add Num"));
//            }
//        System.out.println(Arrays.toString(num));
//        for (int result : num) { // int result = 0; result < num.length; result++
//            total += result;     // total += num[result];
//        }
//        System.out.println("Total is "+total);

        for (int i = 4096; i < 4129; i++) {
            System.out.println((char) i);
        }
        String name = null;
        String password = null;
        String OTP = null;

        boolean running = true;

        while (running) {
            if(name == null) {
                String inputName = JOptionPane.showInputDialog("Enter your name!");
                if (inputName.contentEquals("Admin")) {
                    name = inputName;
            }
            } else if (password == null){
                String inputPassword = JOptionPane.showInputDialog("Enter your password");
                if (inputPassword.contentEquals("12345")) {
                    password = inputPassword;
                }
            } else {
                String inputOtp = JOptionPane.showInputDialog("Enter your OTP");
                if (inputOtp.contentEquals("1525")) {
                    OTP = inputOtp;
                    running =false;
                }
            }
        }
        System.out.println("Well done!");
    }
}
