package com.company.GraficCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIFrame extends JFrame {
    private JPanel panel;
    private String lastCommand;
    private double val = 0.0;
    private String[] command;

    public GUIFrame() {
        setTitle("My first Java GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 500);
        command = new String[]{" / ", " * ", " - ", " + "};


        JTextField textField = new JTextField();
        textField.setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);


        ButtonListener buttonListener = new ButtonListener(textField, lastCommand);
//        CommandListener commandListener = new CommandListener(textField, lastCommand);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));

        for (int i = 1; i < 10; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.addActionListener(buttonListener);
            panel.add(jButton);
        }
        JButton commaButton = new JButton(",");
        commaButton.addActionListener(buttonListener);

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(buttonListener);

        JButton resultButton = new JButton("=");
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String[] splitted = text.split("[/*\\-+]");
                char[] chars = textField.getText().toCharArray();
                ArrayList list = new ArrayList();
                for (int i = 0; i < chars.length; i ++){
                    if (chars[i] == '/')
                        list.add(chars[i]);
                    if (chars[i] == '*')
                        list.add(chars[i]);
                    if (chars[i] == '-')
                        list.add(chars[i]);
                    if (chars[i] == '+')
                        list.add(chars[i]);
                }
                double val = Double.parseDouble(splitted[0]);
                for (int i = 1; i < splitted.length; i++) {
                    double digit = Double.parseDouble(splitted[i]);
                    if (list.get(i - 1).equals('/'))
                        val /= digit;
                    if (list.get(i - 1).equals('*'))
                        val *= digit;
                    if (list.get(i - 1).equals('-'))
                        val -= digit;
                    if (list.get(i - 1).equals('+'))
                        val += digit;
                }

                textField.setText(String.valueOf(val));
            }
        });
        panel.add(commaButton);
        panel.add(zeroButton);
        panel.add(resultButton);

        add(panel, BorderLayout.CENTER);

        JPanel act = new JPanel();
        act.setLayout(new GridLayout(4, 1));

        JButton segmentationButton = new JButton("/");
        segmentationButton.addActionListener(buttonListener);


        JButton multiButton = new JButton("*");
        multiButton.addActionListener(buttonListener);


        JButton subButton = new JButton("-");
        subButton.addActionListener(buttonListener);


        JButton sumButton = new JButton("+");
        sumButton.addActionListener(buttonListener);


        act.add(segmentationButton);
        act.add(multiButton);
        act.add(subButton);
        act.add(sumButton);

        add(act, BorderLayout.EAST);

        setVisible(true);
    }
}
