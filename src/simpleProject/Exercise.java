package simpleProject;

import javax.swing.*;
import java.util.jar.JarEntry;

public class Exercise {
    public static void main(String[] args) {
        boolean running = true;
        String name = null;
        String password = null;
        while (running) {
                String inputName = JOptionPane.showInputDialog("Enter your name");
                switch (inputName) {
                    case "Mg Mg" -> {
                        System.out.println("1");
                        name = inputName;
                        taskPassword(true,inputName);
                        running = false;
                    }
                    case "Su Su" -> {
                        System.out.println("2");
                        name = inputName;
                        running = false;
                    }
                    case "Nu Nu" -> {
                        System.out.println("3");
                        name = inputName;
                        running = false;
                    }
                }
        }
    }
    public static void taskPassword(boolean pw,String inName) {
        String password = null;
        while (pw) {
            switch (inName) {
                case "Mg Mg" -> {
                }
            }
            String inputPw = JOptionPane.showInputDialog("Password");
            if (inputPw.contentEquals("12345")) {
                password = inputPw;
                //System.out.println("GOod");
                //pw = false;
            }
        }
    }

}