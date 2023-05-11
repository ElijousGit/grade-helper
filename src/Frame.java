import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {

    Frame(Color backgroundColor) {

        String imageLibrary = "C:\\Users\\elimu\\Documents\\Github\\grade-helper\\src\\Images\\";

        JFrame frame = new JFrame();
        this.setTitle("Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(400, 400);
        this.setVisible(true);

        ImageIcon image = new ImageIcon(
                imageLibrary + "grade-helper-clipart.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(backgroundColor);
    }

}
