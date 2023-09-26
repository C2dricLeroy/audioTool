package org.example.classes;

import org.example.classes.UserInterfaceComponents.MenuBarBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {


    public UserInterface() {

        //MenuBar
        MenuBarBuilder menuBarBuilder = new MenuBarBuilder();
        this.setJMenuBar(menuBarBuilder);

        JButton playButton = new JButton(
                "Play");

        //Buttons
        playButton.setBounds(
                150, 200, 220,
                50);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Play".equals(e.getActionCommand())) {

                }
            }
        });
        this.add(playButton);

        this.setSize(500, 600);
        this.setLayout(null);
        this.setVisible(true);



        }



}
