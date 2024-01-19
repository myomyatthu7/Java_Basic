package simpleProject.test2;

import javax.swing.*;

public class JOption {
    public String showInputMsg(String inputMsg) {
        return JOptionPane.showInputDialog(inputMsg);
    }
    public void showMsg(String Msg) {
        JOptionPane.showMessageDialog(null, Msg);
    }
    public int confirm(String Msg) {
        return JOptionPane.showConfirmDialog(null,Msg);
    }
}
