package interfac;

import simpleProject.Jar;

import javax.swing.*;

class Main implements ClickEmitter,CountEmitter {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        Animal animal = new Cat();
//        animal.run();
//        cat.getColour(cat.colour);

//        Television television = new Television();
//        television.powerOn();

//        Remote remote = new Television();
//        remote.powerOn();
//        remote.volumeUp();
//        remote.volumeDown();
//        remote.powerOff();

        Action action = new Action(new Main(),new Main());
        //action.doSth();
        action.doSth();
    }
//    @Override
//    public void emit(String data) {
//        System.out.println(data);
//    }
//
//    @Override
//    public void alert(String alert) {
//        JOptionPane.showMessageDialog(null,alert);
//    }

    @Override
    public void count(int count) {
        System.out.println("Count "+count);
    }

    @Override
    public void emit(String data) {
        System.out.println("Name is "+data);
    }

    @Override
    public void alert(String alert) {

    }
}