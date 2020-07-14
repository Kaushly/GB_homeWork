package com.company.GraficCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private final JTextField textField;
    private final StringBuilder sb = new StringBuilder();
    private final String lastCommand;

    public ButtonListener(JTextField textField, String lastCommand) {
        this.textField = textField;
        this.lastCommand = lastCommand;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton currentButton = (JButton) e.getSource();

        sb.append(textField.getText());
        if (!textField.getText().isBlank() && lastCommand != null) {
            sb.append(" " + lastCommand + " ");
        }
        sb.append(currentButton.getText());

        this.textField.setText(sb.toString());

        sb.setLength(0);
    }
}

/*

        sb.append(textField.getText());
        if (!textField.getText().isBlank()) {
            sb.append(" + ");
        }
        sb.append(currentButton.getText());

        this.textField.setText(sb.toString());

        sb.setLength(0);

        System.out.println("Pushed the button...");
 */
