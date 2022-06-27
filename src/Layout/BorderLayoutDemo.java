package Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo  extends JFrame {

    JButton reset, add, update, delete;

    public BorderLayoutDemo() {
        reset = new JButton("Reset");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");

        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set Border
        BorderLayout layout = new BorderLayout();
        setLayout(layout);


        //add each component to the frame
        add(add, BorderLayout.NORTH);
        add(reset, BorderLayout.EAST);
        add(update, BorderLayout.WEST);
        add(delete, BorderLayout.SOUTH);
    }

    public static void main (String[]args){
        BorderLayoutDemo run = new BorderLayoutDemo();
    }

}
