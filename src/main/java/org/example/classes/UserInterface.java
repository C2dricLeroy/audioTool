package org.example.classes;

import javax.swing.JFrame;

public class UserInterface extends JFrame {
    public void Window() {
        this.setTitle("audioTool");
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
