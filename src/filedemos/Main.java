/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        println("--- Misc File Demo ---");
        
        Scanner input = new Scanner(System.in);
        
        println("Please enter the file name: ");
        String fileName = input.nextLine();
        
        //System.out.println("Info is " + info);
        
        Path path = Paths.get(fileName);
        
        if (Files.exists(path)) {
            println("File exists");
            println("Path: " + path.getFileName());
            
            println("Is it a directory? " + Files.isDirectory(path));
            
            if (Files.isDirectory(path)) {
                println("I will display the contents in the directory.");
                try {
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                
                    for (Path p: directoryStream) {
                        println(" * File -> " + p);
                    }
                }
                catch (IOException ioex) {
                    println("Opps. I cannot get the file!" + ioex.getMessage());
                }
            }
            
        }
        else {
            println("No file found with name: " + fileName);
        }
    }
    
//    static void println(String msg) {
//        System.out.println(msg);
//    }

    private static void println(String msg) {
        System.out.println(msg);
    }
}
