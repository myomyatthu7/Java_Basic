package interfacee;

import javax.swing.*;
import java.awt.*;

public class Action {
    ClickEmitter clickEmitter;
    CountEmitter countEmitter;

    public Action(ClickEmitter clickEmitter,CountEmitter countEmitter) {
        this.clickEmitter = clickEmitter;
        this.countEmitter = countEmitter;
    }
    public void doSth() {
        String name = JOptionPane.showInputDialog("Enter your name");
        clickEmitter.emit(name);
        clickEmitter.alert(name);
        countEmitter.count(10);
    }
}
