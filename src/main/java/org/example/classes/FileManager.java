package org.example.classes;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;



import org.example.classes.UserInterfaceComponents.FileChooser;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class FileManager {
    private FileChooser fileChooser;

    public FileManager() {
        this.fileChooser = new FileChooser();
    }

    public File getSelectedFile() {
        fileChooser.openFileChooser();
        return fileChooser.getSelectedFile();
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
