package com.lex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alexishennings on 3/26/17.
 */
public class Argyle extends JFrame {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    private JCheckBox ProgrammersCheckBox;
    private JCheckBox DeadlineCheckBox;
    private JCheckBox ExperiencedCheckBox;
    private JTextField projectName;
    private JButton recommendedButton;
    private JCheckBox StringentQualityCheckBox;
    private JCheckBox WorkingModelCheckBox;
    private JCheckBox EarlyIntegrationCheckBox;
    private JPanel MainPanel;
    private JLabel resultsLabel;

    private boolean programmers;
    private boolean deadline;
    private boolean experienced;
    private boolean stringentQuality;
    private boolean workingModel;
    private boolean earlyIntegration;

    public Argyle() {
        setContentPane(MainPanel);
        pack();
        setVisible(true);
        setTitle("Classified program");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(700, 300));
        String myProjectName = projectName.getText();


        ProgrammersCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                programmers = ProgrammersCheckBox.isSelected();
                updateResults();
            }
        });

        DeadlineCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                deadline = DeadlineCheckBox.isSelected();
                updateResults();
            }
        });

        ExperiencedCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                experienced = ExperiencedCheckBox.isSelected();
                updateResults();
            }
        });

        StringentQualityCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                stringentQuality = StringentQualityCheckBox.isSelected();
                updateResults();
            }
        });

        WorkingModelCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                workingModel = WorkingModelCheckBox.isSelected();
                updateResults();
            }
        });

        EarlyIntegrationCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                earlyIntegration = EarlyIntegrationCheckBox.isSelected();
                updateResults();
            }
        });
    }

    public static void main(String[] args) {

            String player1 = teamNeeded("Agile");
            String player2 = teamNeeded("Waterfall");

            ArrayList cardType = new ArrayList();
            cardType.add("Hello");
            cardType.add(6);
            cardType.add("Data");
            cardType.add(100);
            cardType.add("More data");
            System.out.println(cardType);

        }

        public static String teamNeeded(String team) {

            Scanner input = new Scanner(System.in);

            System.out.println("How many Programmers needed?");
            int programmers = numberScanner.nextInt();

            String deadline = stringScanner.nextLine();
            System.out.println("Is there a firm deadline and fixed schedule?");;

            String experience = stringScanner.nextLine();
            System.out.println("Are the programmers experienced?");

            String quality = stringScanner.nextLine();
            System.out.println("Is there stringent quality control?");

            String early = stringScanner.nextLine();
            System.out.println("Is early integration desirable?");

            String model = stringScanner.nextLine();
            System.out.println("Is a working model required early in the process?");



            if (programmers <= 5){
                System.out.println("You should use an Agile style team.");
            } else {
                System.out.println("You should use a Waterfall style team.");
            }

            deadline = stringScanner.nextLine();
            if (deadline.equalsIgnoreCase("yes")){
                System.out.println("You should use an Agile style team.");
            }
            else {
                System.out.println("You should use a Waterfall style team.");
            }

            experience = stringScanner.nextLine();
            if (experience.equals("yes")){
                System.out.println("You should use an Agile style team.");
            }
            else {
                System.out.println("You should use a Waterfall style team.");
            }

            quality = stringScanner.nextLine();
            if (quality.equals("yes")){
                System.out.println("You should use an Agile style team.");
            }
            else {
                System.out.println("You should use a Waterfall style team.");
            }

            early = stringScanner.nextLine();
            if (early.equals("yes")){
                System.out.println("You should use an Agile style team.");
            }
            else {
                System.out.println("You should use a Waterfall style team.");
            }

            model = stringScanner.nextLine();
            if (model.equals("yes")){
                System.out.println("You should use an Agile style team.");
            }
            else {
                System.out.println("You should use a Waterfall style team.");
            }
            //System.out.println("You should use a Agile style team.");
            //String team = "Agile";
            return team;
        }
    private void updateResults() {
        String hasProgrammers = "Waterfall";
        String hasDeadline = deadline ? "Agile" : "Waterfall";
        String hasExperienced = experienced ? "Agile" : "Waterfall";
        String hasStringentQuality = stringentQuality ? "Agile" : "Waterfall";
        String hasWorkingModel = workingModel ? "Agile" : "Waterfall";
        String hasEarlyIntegration = earlyIntegration ? "Agile" : "Waterfall";

        String results = "You should use a  " + hasProgrammers + hasDeadline + hasExperienced + hasStringentQuality + hasWorkingModel + hasEarlyIntegration;
        resultsLabel.setText(results);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}