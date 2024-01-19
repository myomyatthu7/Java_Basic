package interfacee;

import org.w3c.dom.css.CSSUnknownRule;

import javax.swing.*;
import java.awt.*;

public class Main implements ClickEmitter , CountEmitter {
    public static void main(String[] args) {
        Action action = new Action(new Main(), new Main());
        action.doSth();
    }

    @Override
    public void emit(String data) {
        System.out.println(data);
    }

    @Override
    public void alert(String alert) {
        JOptionPane.showMessageDialog(null,alert);
    }

    @Override
    public void count(int i) {
        System.out.println("I value is"+i);
    }
}
