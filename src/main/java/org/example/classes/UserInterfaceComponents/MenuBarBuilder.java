package org.example.classes.UserInterfaceComponents;

import org.example.classes.FileManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarBuilder extends JMenuBar {

    public MenuBarBuilder() {
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
                    FileChooser fileChooser = new FileChooser();
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
}
