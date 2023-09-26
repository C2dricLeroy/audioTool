package org.example.classes;

import org.example.classes.UserInterfaceComponents.MenuBarBuilder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {


    public UserInterface() {
        this.setLayout(new BorderLayout());

        JPanel buttonPannel = new JPanel();
        buttonPannel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        //MenuBar
        MenuBarBuilder menuBarBuilder = new MenuBarBuilder();
        this.setJMenuBar(menuBarBuilder);

        // Buttons
        JButton playButton = new JButton("Play");        //Buttons
        playButton.setSize(220,50);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Play".equals(e.getActionCommand())) {

                }
            }
        });
        playButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonPannel.add(playButton);

        JButton stopButton = new JButton("Stop");        //Buttons
        stopButton.setSize(220,50);
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Play".equals(e.getActionCommand())) {

                }
            }
        });
        stopButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonPannel.add(stopButton);

        JButton pauseButton = new JButton("Pause");        //Buttons
        pauseButton.setSize(220, 50);
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Play".equals(e.getActionCommand())) {

                }
            }
        });
        pauseButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonPannel.add(pauseButton);



        this.add(buttonPannel, BorderLayout.SOUTH);
        this.pack();
        this.setSize(500, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        }



}
