package org.example;

import org.example.classes.UserInterface;

public class App
{
    public static void main(String[] args){

        UserInterface userInterface = new UserInterface();
        userInterface.showUI();

        System.out.println("App running");
    }
}

