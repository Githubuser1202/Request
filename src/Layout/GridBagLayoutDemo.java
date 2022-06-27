package Layout;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends JFrame {

    JButton red, blue, green;

    public GridBagLayoutDemo(){
         red = new JButton("red");
         blue = new JButton("blue");
         green =  new JButton("green");


         setVisible(true);
         setSize(300, 300);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setTitle("GridBagLayout");
         setLocationRelativeTo(null);

         GridBagLayout layout = new GridBagLayout();
         setLayout(layout);
         GridBagConstraints c = new GridBagConstraints();

         c.gridx = 0;
         c.gridy = 0;
         add(red, c);

         c.gridx = 1;
         c.gridy = 1;
         add(blue,c);

         c.gridx = 2;
         c.gridy = 2;
         add(blue, c);

    }
}
