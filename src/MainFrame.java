import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    float fScore = 0f;

    public void initializeGUI() {
        /**************** TEST SCORES ****************/

        JLabel lbAssignmentA = new JLabel("Assignment A:");
        lbAssignmentA.setFont(mainFont);

        JTextField tfAGrade = new JTextField();
        tfAGrade.setFont(mainFont);

        JLabel lbAssignmentB = new JLabel("Assignment B:");
        lbAssignmentB.setFont(mainFont);

        JTextField tfBGrade = new JTextField();
        tfBGrade.setFont(mainFont);

        JLabel lbTestA = new JLabel("Test A:");
        lbTestA.setFont(mainFont);

        JTextField tfTestGrade = new JTextField();
        tfTestGrade.setFont(mainFont);

        JPanel scorePanel = new JPanel();
        scorePanel.setLayout(new GridLayout(2, 1, 5, 5));
        scorePanel.add(lbAssignmentA);
        scorePanel.add(lbAssignmentB);
        scorePanel.add(lbTestA);
        scorePanel.add(tfAGrade);
        scorePanel.add(tfBGrade);
        scorePanel.add(tfTestGrade);

        /**************** FINAL SCORE ****************/

        JLabel finalScore = new JLabel("Final Grade:");
        finalScore.setFont(mainFont);

        JLabel finalGrade = new JLabel();
        finalGrade.setFont(mainFont);

        JPanel finalScorePanel = new JPanel();
        finalScorePanel.setLayout(new GridLayout(1, 2, 10, 10));
        finalScorePanel.add(finalScore);
        finalScorePanel.add(finalGrade);

        JLabel lbLetterGrade = new JLabel();
        lbLetterGrade.setFont(mainFont);
        finalScorePanel.add(lbLetterGrade);

        JButton btnCalc = new JButton("Calculate Final Grade");
        btnCalc.setFont(mainFont);

        btnCalc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // TODO Auto-generated method stub
                boolean cont = true;
                ArrayList<Float> aggreScore = new ArrayList<>();
                try {
                    aggreScore.add(
                            ((Float.parseFloat(tfAGrade.getText())) / 10f) * .2f);
                    aggreScore.add(
                            ((Float.parseFloat(tfBGrade.getText())) / 15f) * .2f);
                    aggreScore.add(
                            ((Float.parseFloat(tfTestGrade.getText())) / 10f) * .6f);
                } catch (Exception nullPointerException) {
                    System.out.println("Error: Invalid input for text field");
                    cont = false;
                }

                if (cont) {
                    finalGrade.setText((GetFinalScore(aggreScore)));
                    lbLetterGrade.setText(GetLetterGrade(fScore));
                    fScore = 0f;
                }

            }

        });

        /**************** MAIN PANEL ****************/

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 5, 5));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 128));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(scorePanel, BorderLayout.NORTH);
        mainPanel.add(finalScorePanel, BorderLayout.CENTER);
        mainPanel.add(btnCalc, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Test Scores");
        setSize(600, 400);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String GetLetterGrade(Float score) {

        float targetScore = 1f;
        String[] gradeLetters = { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        String letterGrade = "_";

        for (int i = 0; targetScore > score; i++) {
            targetScore -= .025f;
            letterGrade = gradeLetters[i];
        }

        // this if statement checks if the score is over 100%, and assigns the highest
        // possible grade
        if (score >= 1f) {
            letterGrade = gradeLetters[0];
        }

        return letterGrade;

        // if (score >= .9f) {
        // return "A";
        // } else if (score <= .59f) {
        // return "F";
        // } else if (score <= .69f) {
        // return "D";
        // } else if (score <= .79f) {
        // return "C";
        // } else if (score <= .89f) {
        // return "B";
        // } else {
        // return null;
        // }

    }

    public String GetFinalScore(ArrayList<Float> input) {
        for (int i = 0; i < input.size(); i++) {
            fScore += input.get(i);
        }
        return String.valueOf(fScore);
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
}
