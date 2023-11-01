package org.example.classes;

import javax.swing.*;
import java.awt.*;

public class Theme {
    private String name;
    private Color backgroundColor;
    private Color textColor;
    private Font textFont;
    private ImageIcon backgroundImage;

    public Theme(String name, Color backgroundColor, Color textColor, Font textFont, ImageIcon backgroundImage){
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

    public Color getTextColor() {
        return this.textColor;
    }

    public Font getTextFont() {
        return this.textFont;
    }

    public ImageIcon getBackgroundImage() {
        return this.backgroundImage;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundImage(ImageIcon backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTextFont(Font textFont) {
        this.textFont = textFont;
    }

}
