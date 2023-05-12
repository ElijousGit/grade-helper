
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class StudentMenu {
    static String imageLibrary = "C:\\Users\\elimu\\Documents\\Github\\grade-helper\\src\\Images\\";

    static Font mainFont = new Font("Times New Roman", Font.ITALIC, 30);
    static Border border = BorderFactory.createLineBorder(Color.BLACK, 5);

    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon(imageLibrary + "grade-helper-clipart.png");
        ImageIcon imageLogo = new ImageIcon(imageLibrary + "grade-helper-logo.png");

        JFrame frame = new Frame(CustomColors.tan, 575, 700);

        JLabel welcome = new JLabel("Welcome to grade helper");
        welcome.setIcon(imageLogo);
        welcome.setHorizontalTextPosition(JLabel.CENTER);
        welcome.setVerticalTextPosition(JLabel.TOP);
        welcome.setForeground(Color.BLACK);
        welcome.setFont(mainFont);
        welcome.setIconTextGap(50);
        welcome.setBorder(border);
        welcome.setVerticalAlignment(JLabel.CENTER);
        welcome.setHorizontalAlignment(JLabel.CENTER);

        frame.setIconImage(imageIcon.getImage());
        frame.add(welcome);
        frame.pack(); // based on the size of the components, this will
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