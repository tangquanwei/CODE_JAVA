package com.toolkit.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainUI {
    JFrame frame;

    MainUI() {
        frame = new JFrame("Quanwei's Toolkit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("欢迎使用权威的TOOLKit");
        label.setSize(50, 10);

        frame.add(label);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MainUI ui = new MainUI();

    }
}
