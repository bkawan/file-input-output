/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.fileapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bkawan
 * @date Mar 1, 2016
 * @time 10:49:17 PM
 */
public class BufferReader {

    public  void main() {

        try {

            //public File(String pathname) ==writeToFile.txt
            /**
             * Creates a new File instance by converting the given pathname
             * string into an abstract pathname. If the given string is the
             * empty string, then the result is the empty abstract pathname.
             */
            File file = new File("writeToFile.txt");
            // public File(String pathname)

            /**
             * public FileReader(File file) throws FileNotFoundException Creates
             * a new FileReader, given the File to read from.
             */
            FileReader fileReader = new FileReader(file);
            /**
             * public BufferedReader(Reader in) FileReader is type of Reader
             * Creates a buffering character-input stream that uses a
             * default-sized input buffer
             */
            BufferedReader bReader = new BufferedReader(fileReader);
            //same as above
            BufferedReader reader = new BufferedReader(new FileReader(new File("writeToFile.txt")));

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
