package org.example.classes;

import jdk.jfr.internal.LogLevel;

public class Logger {

    private static Logger instance;
    private boolean logToFile;
    private String logFilePath;
    private boolean logToConsole;
    private String databaseConnection;


    private Logger() {

    }

    public static Logger getInstance() {
        return null;
    }

    public void logMessage(String message, LogLevel logLevel) {

    }

    private void logToConsole(String message, LogLevel logLevel) {

    }

    private void logtoFile(String message, LogLevel logLevel) {

    }

    private void logToDatabase(String message, LogLevel logLevel) {

    }


}
