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
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bkawan
 * @date Mar 3, 2016
 * @time 12:09:10 PM
 */
public class CopyPaste {

    public  void main() throws IOException {

        try {

            File file = new File("copy.txt");

            Scanner input = new Scanner(System.in);
            FileReader fileReader;

            fileReader = new FileReader(file);

            BufferedReader bReader = new BufferedReader(fileReader);

            BufferedReader reader = new BufferedReader(new FileReader(new File("copypaste.txt")));

            String line = "";
            
             //After reading the website file now wrte the website file into computer
                StringBuilder builder = new StringBuilder();
           while((line = reader.readLine()) != null){
               
              System.out.println(line);
              builder.append(line);
           }
           
            reader.close();
            
              System.out.println("Do you want to save:[Y/N]");
                if(input.next().equalsIgnoreCase("y")){
                    System.out.println("Enter file name");
                    writeFile(input.next(), builder.toString());
                    System.out.println("file saved");
                }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeFile(String fileName, String contents) throws IOException {
        FileWriter writer = new FileWriter(new File(fileName));//file name user will type
        writer.write(contents);// data from website
        writer.close();

    }
}
