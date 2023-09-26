package org.example.classes.UserInterfaceComponents;

import javax.swing.*;

public class MenuBarBuilder extends JMenuBar {

    public MenuBarBuilder() {
        JMenu files = new JMenu("Files");
        JMenu tools = new JMenu("Tools");
        JMenu settings = new JMenu("Settings");

        JMenuItem newSong = new JMenuItem("Add Song");
        JMenuItem newPlaylist = new JMenuItem("Add Playlist");
        JMenuItem quit = new JMenuItem("Quit");
        JMenuItem modifyTheme = new JMenuItem("Modify Theme");


        files.add(newSong);
        files.add(newPlaylist);
        settings.add(modifyTheme);
        files.add(quit);

        this.add(files);
        this.add(tools);
        this.add(settings);
    }
}
