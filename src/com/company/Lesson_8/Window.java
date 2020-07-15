package com.company.Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private double result = 0;
    private String lastCommand = "";
    private JPanel panel;

    public Window() {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setBounds(300, 300, 400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JButton display = new JButton("");
        frame.add(display, BorderLayout.NORTH);

        ActionListener command = new CommandListener(display, result, lastCommand);
        ActionListener insert = new InsertListener(display);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton("00", insert);
        addButton("=", command);
        addButton("+", command);

        frame.add(panel, BorderLayout.CENTER);

        pack();
        frame.setVisible(true);
    }

    public void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }
}
