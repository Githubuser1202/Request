package Basics;

import javax.swing.*;

public class PanelDemo extends JFrame {
     JPanel  Panel;

     public PanelDemo(){
         Panel = new JPanel ();
         setSize(300, 300);
         setVisible(true);
         setLocationRelativeTo(null);
         setTitle("The frame");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         add(Panel);
     }

     public static void main (String[]args){
         PanelDemo run = new PanelDemo();
     }
}