package com.company.Lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandListener implements ActionListener {

    private JButton display;
    private String lastCommand;
    private double result;

    public CommandListener(JButton display, double result, String lastCommand) {
        this.display = display;
        this.lastCommand = lastCommand;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        double number = Double.parseDouble(display.getText());
        calculate(number);
        lastCommand = command;
    }

    public void calculate(double number) {
        switch (lastCommand) {
            case "+":
                display.setText("");
                result += number;
                display.setText("" + result);
                break;
            case "-":
                result -= number;
                display.setText("" + result);
                break;
            case "*":
                result *= number;
                display.setText("" + result);
                break;
            case "/":
                result /= number;
                display.setText("" + result);
                break;
            case "=":
                display.setText("" + result);
                break;
            default:
                result = number;
                display.setText("");
                break;
        }
    }
}
