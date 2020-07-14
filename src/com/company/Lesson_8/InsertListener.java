package com.company.Lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertListener implements ActionListener {
    private JButton display;


    public InsertListener(JButton display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String input = event.getActionCommand();
        display.setText(input);
    }
}
