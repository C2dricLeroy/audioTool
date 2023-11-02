package org.example.classes;

import org.example.classes.UserInterfaceComponents.MenuBarBuilder;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static org.example.classes.FileManager.getDurationOfFile;


public class UserInterface extends JFrame {
    private FileManager fileManager;
    private Playlist playlist;
    private DefaultTableModel tableModel;
    private JTable songTable;
    private JList<String> songList;


    public UserInterface() {
        playlist = new Playlist("default playlist");
        this.fileManager = new FileManager();
        MusicPlayer musicPlayer = new MusicPlayer();

        this.setLayout(new BorderLayout());

        //Pannels
        JPanel buttonPannel = new JPanel();
        buttonPannel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        //Title
        JLabel titleLabel = new JLabel("audioTool", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(64, 64, 64));
        titleLabel.setOpaque(false);
        this.add(titleLabel, BorderLayout.NORTH);

        //MenuBar
        MenuBarBuilder menuBarBuilder = new MenuBarBuilder(this, fileManager, musicPlayer);
        this.setJMenuBar(menuBarBuilder);

        MenuBar menuBar = this.getMenuBar();

        // Playlist

        DefaultListModel<String> listModel = new DefaultListModel<>();
        songList = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(songList);
        this.add(scrollPane, BorderLayout.WEST);

        JPanel playlistPanel = new JPanel();
        playlistPanel.setLayout(new BorderLayout());
        JTextField filePathField = new JTextField(20);

        JButton addFromFileButton = new JButton("Add");
        addFromFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Add".equals(e.getActionCommand())) {
                    File selectedFile = fileManager.getSelectedFile();
                    if (selectedFile != null) {
                        String fileName = selectedFile.getName();
                        String title = fileName.substring(0, fileName.lastIndexOf("."));
                        int duration = getDurationOfFile(selectedFile);
                        Song newSong = new Song(title, duration, selectedFile.getPath());
                        playlist.addSong(newSong);
                        System.out.println(playlist.songs.size());
                        updatePlaylistTable();
                        System.out.println(playlist.songs.size());
                        try {
                            musicPlayer.play(selectedFile);
                        } catch (LineUnavailableException | IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        });

        playlistPanel.add(filePathField, BorderLayout.CENTER);
        playlistPanel.add(addFromFileButton, BorderLayout.SOUTH);
        this.add(playlistPanel, BorderLayout.WEST);



        // Buttons

        JButton playButton = new JButton("Play");
        playButton.setSize(220,50);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Play".equals(e.getActionCommand())) {
                    musicPlayer.resume();
                }
            }
        });
        playButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonPannel.add(playButton);

        JButton stopButton = new JButton("Stop");
        stopButton.setSize(220,50);
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Stop".equals(e.getActionCommand())) {
                    musicPlayer.stop();
                }
            }
        });
        stopButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonPannel.add(stopButton);

        JButton pauseButton = new JButton("Pause");
        pauseButton.setSize(220, 50);
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Pause".equals(e.getActionCommand())) {
                    musicPlayer.pause();
                }
            }
        });
        pauseButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonPannel.add(pauseButton);


        this.add(buttonPannel, BorderLayout.SOUTH);
        this.pack();
        this.setSize(500, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

    public void showUI() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    public void updatePlaylistTable() {
        DefaultListModel<String> listModel = (DefaultListModel<String>) songList.getModel();
        listModel.clear();

        for (Song song : playlist.getSongs()) {
            listModel.addElement(song.getTitle());
        }
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}
