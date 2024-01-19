package simpleProject.test;

import simpleProject.Test;

import javax.swing.*;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //totalNumber();
        total();
    }
    public static void totalNumber() {
        int [] numArray = new int[5];
        for (int i =0; i< numArray.length; i++) {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
            numArray[i] = number;
        }
        int total = 0;
        for (int a =0; a < numArray.length; a++) {
            total += numArray[a];
        }
        for (int num : numArray) {
            System.out.println(num);
        }
        System.out.println("Total is : "+total);
    }
    public static void total() {
        ArrayList <Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(4);
//        arrayList.add(3);
//        arrayList.add(2);
//        System.out.println(arrayList);

        boolean running = true;
        while (running) {
//            for (int i =0;i< arrayList.size()+1 ;i++) {
//                int addNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
//                arrayList.add(addNum);
//            }
            int addNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
            int confirm = JOptionPane.showConfirmDialog(null,"Add More?");
            switch (confirm) {
                case 0 -> arrayList.add(addNum);
                case 1, 2 -> {arrayList.add(addNum);
                    running = false;
                }
            }
        }
        System.out.println(arrayList);
        int total = 0;
        for (int num : arrayList) {
            total += num;
        }
        System.out.println("Total is : "+total);

//
//        int total = 0;
//        for (int num : arrayList) {
//            total += num;
//        }
//        System.out.println(total);
    }
}
