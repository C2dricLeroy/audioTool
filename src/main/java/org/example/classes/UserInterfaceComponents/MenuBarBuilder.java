package org.example.classes.UserInterfaceComponents;

import org.example.classes.*;
import org.example.classes.dbConnection.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static org.example.classes.FileManager.getDurationOfFile;

public class MenuBarBuilder extends JMenuBar {
    private FileManager fileManager;
    private UserInterface userInterface;


    public MenuBarBuilder(UserInterface userInterface, FileManager fileManager) {
        this.fileManager = fileManager;
        this.userInterface = userInterface;
        JMenu files = new JMenu("Files");
        JMenu tools = new JMenu("Tools");
        JMenu settings = new JMenu("Settings");

        JMenuItem newSong = new JMenuItem("Add Song");
        JMenuItem newPlaylist = new JMenuItem("Add Playlist");
        JMenuItem quit = new JMenuItem("Quit");
        JMenuItem modifyTheme = new JMenuItem("Modify Theme");

        newSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Add Song".equals(e.getActionCommand())) {
                    File selectedFile = fileManager.getSelectedFile();

                    if (selectedFile != null) {
                        String fileName = selectedFile.getName();
                        String title = fileName.substring(0, fileName.lastIndexOf("."));

                        int duration = getDurationOfFile(selectedFile);
                        Song newSong = new Song(title, duration, selectedFile.getPath());
                        userInterface.getPlaylist().addSong(newSong);
                    }
                }
            }
        });

        modifyTheme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Modify Theme".equals(e.getActionCommand())) {
                    setPopupMenu();
                }
            }
        });




        files.add(newSong);
        files.add(newPlaylist);
        settings.add(modifyTheme);
        files.add(quit);

        this.add(files);
        this.add(tools);
        this.add(settings);
    }
    public void setPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();

        // Composants pour permettre à l'utilisateur de définir les propriétés du thème
        JTextField nameField = new JTextField("New Theme");
        JColorChooser backgroundColorChooser = new JColorChooser();
        JColorChooser textColorChooser = new JColorChooser();
        JComboBox<String> fontComboBox = new JComboBox<>(new String[]{"Arial", "Times New Roman", "Verdana"});
        JButton createThemeButton = new JButton("Create Theme");

        // Associez un ActionListener au bouton "Create Theme" pour créer un nouveau thème
        createThemeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                Color backgroundColor = backgroundColorChooser.getColor();
                Color textColor = textColorChooser.getColor();
                Font selectedFont = new Font((String) fontComboBox.getSelectedItem(), Font.PLAIN, 12);

                DatabaseConnection db;

                db = DatabaseConnection.getInstance();

                Theme newTheme = new Theme(name, backgroundColor, textColor, selectedFont, null);

                String insertThemeSQL = "INSERT INTO Theme (name, backgroundColor, textColor, selectedFont) VALUES (?, ?, ?, ?)";
                db.executeUpdate(insertThemeSQL);
                popupMenu.setVisible(false);
            }
        });

        popupMenu.add(new JLabel("Theme Name:"));
        popupMenu.add(nameField);
        popupMenu.add(new JLabel("Background Color:"));
        popupMenu.add(backgroundColorChooser);
        popupMenu.add(new JLabel("Text Color:"));
        popupMenu.add(textColorChooser);
        popupMenu.add(new JLabel("Text Font:"));
        popupMenu.add(fontComboBox);
        popupMenu.add(createThemeButton);
/*
        popupMenu.show(this, modifyTheme.getX(), modifyTheme.getY() + modifyTheme.getHeight());*/
    }

}
