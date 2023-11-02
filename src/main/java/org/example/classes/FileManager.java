package org.example.classes;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileManager {


    public FileManager() {
    }

    public File getSelectedFile() {
        JFileChooser fileChooser = new JFileChooser();
        FileFilter audioFileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name = file.getName().toLowerCase();
                return file.isDirectory() || name.endsWith(".mp3") || name.endsWith(".wav");
            }

            @Override
            public String getDescription() {
                return "Fichiers audio (*.mp3, *.wav)";
            }
        };
        fileChooser.setFileFilter(audioFileFilter);

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public static int getDurationOfFile(File file) {
        try {

            AudioFile audioFile = AudioFileIO.read(file);

            return (int) audioFile.getAudioHeader().getTrackLength();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
