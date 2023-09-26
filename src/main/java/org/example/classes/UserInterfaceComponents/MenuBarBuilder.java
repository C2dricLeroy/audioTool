package org.example.classes.UserInterfaceComponents;

import javax.swing.*;

public class MenuBarBuilder extends JMenuBar {

    public MenuBarBuilder() {

        JMenu menu = new JMenu("Menu");
        JMenuItem settings = new JMenuItem("Settings");
        JMenuItem m1 = new JMenuItem("MenuItem2");
        JMenuItem m2 = new JMenuItem("MenuItem3");

        menu.add(settings);
        menu.add(m1);
        menu.add(m2);

        this.add(menu);
    }

}
