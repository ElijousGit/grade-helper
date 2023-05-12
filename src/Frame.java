import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame {

    Frame(Color backgroundColor, int width, int height) {

        new JFrame();
        this.setTitle("Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(height, width);
        this.setVisible(true);
        this.getContentPane().setBackground(backgroundColor);

    }

}
