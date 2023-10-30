package org.example.classes;

import javax.swing.*;
import java.awt.*;

public class Theme {
    private String name;
    private Color backgroundColor;
    private Color textColor;
    private Font textFont;
    private ImageIcon backgroundImage;

    Theme(String name, Color backgroundColor, Color textColor, Font textFont, ImageIcon backgroundImage){
        this.name = name;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.textFont = textFont;
        this.backgroundImage = backgroundImage;
    }

    public String getName() {
        return this.name;
    }

    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public Color getTextcolor() {
        return this.textColor;
    }

    public Font getTextFont() {
        return this.textFont;
    }

    public ImageIcon getBackgroundImage() {
        return this.backgroundImage;
    }


}
