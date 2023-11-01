package org.example.classes.UserInterfaceComponents;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileChooser extends JFileChooser {
    private File selectedFile;

    public FileChooser() {
        setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".mp3")
                        || file.getName().toLowerCase().endsWith(".wav");
            }
            @Override
            public String getDescription() {
                return "Fichiers audio (*.mp3, *.wav)";
            }
        });
    }

    public void openFileChooser() {
        int result = this.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = this.getSelectedFile();
        }
    }

    public File getSelectedFile() {
        return selectedFile;
    }
}
