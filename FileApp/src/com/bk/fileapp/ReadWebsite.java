/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.fileapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author bkawan
 * @date Mar 1, 2016
 * @time 11:09:46 PM
 */
public class ReadWebsite {
    
    public  void main() {
        
        try {
            while (true) {
                // 1.url to read
                //URL url = new URL("http://youtube.com");
                // input url from user 
                System.out.println("Enter URL: ");
                Scanner input = new Scanner(System.in);
               // String link = new Scanner(System.in).nextLine();
                // URL url = new URL(new Scanner(System.in).nextLine());
                //public URL(String spec);
                String link = input.nextLine();
                if (link.equalsIgnoreCase("exit")) {
                    System.exit(0);
                }
                URL url = new URL(link);

                //2. need connection
                URLConnection conn = url.openConnection();
                //3. either read from website or write data to website
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line = "";
                //After reading the website file now wrte the website file into computer
                StringBuilder builder = new StringBuilder();
                
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    builder.append(line + "\r\n");
                }
                reader.close();
                System.out.println("Do you want to save:[Y/N]");
                if(input.next().equalsIgnoreCase("y")){
                    System.out.println("Enter file name");
                    writeFile(input.next(), builder.toString());
                    System.out.println("file saved");
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
    }  
        public static void writeFile(String fileName, String contents) throws IOException{
            FileWriter writer = new FileWriter(new File(fileName));//file name user will type
            writer.write(contents);// data from website
            writer.close();
            
        }
        
    
}
