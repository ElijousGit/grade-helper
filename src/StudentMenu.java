import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class StudentMenu {
    public static void main(String[] args) {
        new Frame(new Color(211, 203, 199, 255));
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