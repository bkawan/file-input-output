/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.fileapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bikeshkawan
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("    Welcome to File Handling");
        System.out.println("=================================");
        System.out.println("1. ReadWebsite and save: ");
        System.out.println("2. Read file : ");

        System.out.println("3. Write to file example 1: ");

        System.out.println("4. write to file example 2: ");
        System.out.println("5. Create A file example ");
        System.out.println("6. BufferReader example");
        System.out.println("7. File copy paste example");
        System.out.println("=================================");
        System.out.println("Enter Your Choice[1-7]: ");
        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {

            case 1:
                ReadWebsite rw = new ReadWebsite();
                rw.main();
                break;
            case 2:
                FileReading fr = new FileReading();
                fr.main();
                break;
            case 3:
                writeToFileExample1();
                break;
            case 4:
                writeToFileExample2();
                break;
            case 5:
                createFileExample1();
                break;
            case 6:
                BufferReader br = new BufferReader();
                br.main();

                break;
            case 7:
                CopyPaste cp = new CopyPaste();
                 {
                    try {
                        cp.main();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;

        }

//        createFileExample1();
//        writeToFileExample1();
        // writeToFileExample2();
    }

    public static void createFileExample1() {
        try {

            // TODO code application logic here
            // String desktop = System.getProperty ("user.home") + "/documents/";
            File file = new File("createFileExample1.txt");
            file.createNewFile();
            System.out.println("createFileExample1 created sucessfully");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeToFileExample1() {

        try (FileWriter writer = new FileWriter(new File("writeToFileExample1.txt"))) {
            writer.write("write to file exmple \r\n This is core java.\r\n This is interesting to learn.");
            System.out.println("writeToFileExample1 Sucessfully written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }
    }

    public static void writeToFileExample2() {

        try {

            FileWriter writer = new FileWriter(new File("writeToFileExample2.txt"));
            // to get input from user from system not from file
            Scanner input = new Scanner(System.in);
            String line = "";

            System.out.println("Type exit to save when you are done with writing");

            System.out.println(">");
            StringBuilder builder = new StringBuilder();
            // continue writing untill user type exit
            while (!(line = input.nextLine()).equalsIgnoreCase("exit")) {
                System.out.println(">");
                builder.append(line + "\r\n");//add all the lines from the user input into one string
                // exit and and write to the file
            }
            // come out from while loop and write to the file whatever user has typed
            // now write string created by builder into the file 
            writer.write(builder.toString());

            writer.close();
            System.out.println("i am a String builder object \r\n" + builder);
        } catch (IOException ex) {
            Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
