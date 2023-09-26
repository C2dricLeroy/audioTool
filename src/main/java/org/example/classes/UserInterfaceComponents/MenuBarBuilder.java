package org.example.classes.UserInterfaceComponents;

import javax.swing.*;

public class MenuBarBuilder extends JMenuBar {

    public MenuBarBuilder() {
        JMenu menu = new JMenu("Menu");
        JMenuItem settings = new JMenuItem("Settings");

        menu.add(settings);
        this.add(menu);
    }
}
