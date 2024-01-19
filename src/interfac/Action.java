package interfac;

import simpleProject.Jar;

import javax.swing.*;

class Action {
    ClickEmitter clickEmitter;
    CountEmitter countEmitter;
    public Action(ClickEmitter clickEmitter,CountEmitter countEmitter) {
        this.clickEmitter = clickEmitter;
        this.countEmitter = countEmitter;
    }
    public void doSth() {
        String name = JOptionPane.showInputDialog("Enter your name!");
        clickEmitter.emit(name);
        countEmitter.count(10);
    }
}