/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.fileapp;

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
 * @time 9:40:51 PM
 */
public class FileReading {

    public  void main() {

        System.out.println("File Reading");
                    System.out.println("------------------");


        try {
            FileReader reader = new FileReader(new File("filereading.txt"));

            int i = 1;
            //read single character and return integer ACII code
            while ((i = reader.read()) != -1) {
                //return interger ASCIi code
                System.out.println("Ascii: " +i);
                System.out.println("casting to Character : " + (char) i);

            }
            System.out.println("------------------");
            reader.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
