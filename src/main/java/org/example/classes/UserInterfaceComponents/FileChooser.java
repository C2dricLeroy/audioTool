package org.example.classes.UserInterfaceComponents;

import org.example.classes.UserInterface;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileChooser extends JFileChooser {

    public FileChooser() {
        setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) {
                // Filtrer les fichiers pour afficher uniquement les fichiers MP3 et WAV
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".mp3")
                        || file.getName().toLowerCase().endsWith(".wav");
            }

            @Override
            public String getDescription() {
                return "Fichiers audio (*.mp3, *.wav)";
            }
        });

        int result = this.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = this.getSelectedFile();

        }
    }



}
