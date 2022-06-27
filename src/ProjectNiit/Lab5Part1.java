package ProjectNiit;

//import java.awt.*;
import javax.swing.*;


public class Lab5Part1 {
      static void lab5(){
        JFrame f = new JFrame("City");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

         new JMenu("Cities");

         new JMenuItem("Lagos");
         new JMenuItem("Port Harcourt");
         new JMenuItem("Delta");
         new JMenuItem("Abuja");

        f.setJMenuBar(menuBar);
        f.setSize(32,32);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main (String [] args){

    }
}
