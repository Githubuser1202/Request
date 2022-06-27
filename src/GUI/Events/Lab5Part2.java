package GUI.Events;

import java.awt.*;

public class Lab5Part2 {

    Lab5Part2(){
        Frame f = new Frame("Menu");
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Cities");
        MenuItem i1 = new MenuItem("Lagos");
        MenuItem i2 = new MenuItem("Abuja");
        MenuItem i3 = new MenuItem("Benin");
        MenuItem i4 = new MenuItem("Port Harcourt");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main (String []args ) {

        new Lab5Part2();
    }
}
