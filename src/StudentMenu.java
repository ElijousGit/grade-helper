
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class StudentMenu {
    static String imageLibrary = "C:\\Users\\elimu\\Documents\\Github\\grade-helper\\src\\Images\\";

    static Font mainFont = new Font("Times New Roman", Font.PLAIN, 30);
    static Font titleFont = new Font("Times New Roman", Font.ITALIC, 65);

    static Border border = BorderFactory.createLineBorder(Color.BLACK, 5);

    public static void main(String[] args) {

        // ALL of this $#!@ just to resize an image. It looks disgusting.
        BufferedImage bufferedImage = null;
        BufferedImage bufferedImage2 = null;
        try {
            bufferedImage = ImageIO
                    .read(new File("C:\\Users\\elimu\\Documents\\Github\\grade-helper\\src\\Images\\report card.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedImage2 = ImageIO
                    .read(new File(
                            "C:\\Users\\elimu\\Documents\\Github\\grade-helper\\src\\Images\\grade-helper-logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image resizedGradeManIcon = bufferedImage.getScaledInstance(100, 75, Image.SCALE_DEFAULT);
        Image resizedLogoIcon = bufferedImage2.getScaledInstance(230, 210, Image.SCALE_DEFAULT);

        // Image definitions
        ImageIcon manageGradeIcon = new ImageIcon(resizedGradeManIcon);
        ImageIcon imageIcon = new ImageIcon(getCustomImage("grade-helper-clipart.png"));
        ImageIcon imageLogo = new ImageIcon(resizedLogoIcon /* getCustomImage("grade-helper-logo.png") */);

        JFrame frame = new Frame(CustomColors.tan, 1400, 1000);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel whitePanel = new JPanel();
        whitePanel.setPreferredSize(new Dimension(100, 250));
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBorder(border);

        JPanel buttons = new JPanel();
        buttons.setBackground(null);

        JLabel welcome = new JLabel("Welcome to grade helper");
        welcome.setIcon(imageLogo);
        welcome.setHorizontalTextPosition(JLabel.LEFT);
        welcome.setVerticalTextPosition(JLabel.CENTER);
        welcome.setForeground(Color.BLACK);
        welcome.setFont(titleFont);
        welcome.setIconTextGap(50);
        welcome.setVerticalAlignment(JLabel.CENTER);
        welcome.setHorizontalAlignment(JLabel.RIGHT);

        // Add text to the white panel
        whitePanel.add(welcome);

        JButton button = new JButton();
        // button.setBounds(500, 100, 400, 100);
        button.setText("Manage Grades");
        button.setFont(mainFont);
        button.setFocusable(false);
        button.setIcon(manageGradeIcon);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setVerticalAlignment(JButton.TOP);
        button.setHorizontalAlignment(JButton.RIGHT);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createBevelBorder(0));

        button.addActionListener(e -> System.out.println("haha"));

        buttons.add(button);

        // Add everything to frame
        frame.setIconImage(imageIcon.getImage());
        frame.add(whitePanel, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.EAST);
        // frame.add(buttons, BorderLayout.CENTER);
        // frame.pack(); // based on the size of the components, this will adjust the
        // size accordingly
    }

    public static String getCustomImage(String imageName) {
        return imageLibrary + imageName;
    }
}
// public void initialize() {
// /**** FORM PANEL *****/
// JLabel lbFirstName = new JLabel("First Name");
// lbFirstName.setFont(mainFont);

// tfFirstName = new JTextField();
// tfFirstName.setFont(mainFont);

// JLabel lbLastName = new JLabel("Last Name");
// lbLastName.setFont(mainFont);

// tfLastName = new JTextField();
// tfLastName.setFont(mainFont);

// first number: # of rows,
// second number: # of columns, third
// // & fourth row: Margin between different components
// formPanel.setOpaque(false);
// formPanel.add(lbFirstName);
// formPanel.add(tfFirstName);
// formPanel.add(lbLastName);
// formPanel.add(tfLastName);

// /**** WELCOME LABEL ****/
// lbWelcome = new JLabel();
// lbWelcome.setFont(mainFont);

// /**** BUTTONS PANEL *****/
// JButton btnOK = new JButton("OK");
// btnOK.setFont(mainFont);
// btnOK.addActionListener(new ActionListener() {

// @Override
// public void actionPerformed(ActionEvent e) {
// // This code is executed when the button is pressed
// String firstName = tfFirstName.getText();
// String lastName = tfLastName.getText();
// lbWelcome.setText("Hello " + firstName + " " + lastName);
// }

// });

// JButton btnClear = new JButton("Clear");
// btnClear.setFont(mainFont);
// btnClear.addActionListener(new ActionListener() {

// @Override
// public void actionPerformed(ActionEvent e) {
// // This code is executed when the button is pressed
// tfFirstName.setText("");
// tfLastName.setText("");
// lbWelcome.setText("");
// }

// });

// JPanel buttonsPanel = new JPanel();
// buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
// buttonsPanel.setOpaque(false);
// buttonsPanel.add(btnOK);
// buttonsPanel.add(btnClear);

// JPanel mainPanel = new JPanel();
// mainPanel.setLayout(new BorderLayout());
// mainPanel.setBackground(new Color(128, 128, 255));
// mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
// mainPanel.add(formPanel, BorderLayout.NORTH);
// mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
// mainPanel.add(lbWelcome, BorderLayout.CENTER);

// add(mainPanel);

// setTitle("Welcome");
// setSize(500, 600);
// setMinimumSize(new Dimension(300, 400));
// setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
// setVisible(true);
// }