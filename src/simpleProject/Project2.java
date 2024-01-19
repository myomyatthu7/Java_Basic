package simpleProject;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Project2 {
    public static void main(String[] args) {
        String name = null;
        String pw = null;
        boolean running = true;
//        String [] nameArray = {"Mg Mg","Su Su","Nu Nu"};
//        for (String names : nameArray)
        while (running) {
            if (name == null) {
                String inputName = JOptionPane.showInputDialog("Enter your name");
                if (inputName.contentEquals("Admin")) {
                    name = inputName;
                }
            } else {
                String inputPw = JOptionPane.showInputDialog("Enter your pw");
                if (inputPw.contentEquals("12345")) {
                    pw = inputPw;
                    running = false;
                }
            }
        }
        System.out.println("Ok");
    }
}
