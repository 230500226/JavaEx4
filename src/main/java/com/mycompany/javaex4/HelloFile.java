/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex4;

/**
 *
 * @author ldxt460s
 */
public class HelloFile {

    public static void start() {
        java.io.File file = new java.io.File("HelloWorld.txt");
        if (file.exists()) {
            System.out.println("File already exists");
        } else {
            try {
                java.io.PrintWriter output = new java.io.PrintWriter(file);

                    System.out.println("Enter a message to write to the file");
                    java.util.Scanner input = new java.util.Scanner(System.in);
                    String message = input.nextLine();
                    // make the message number relative to the previous message number


                    output.println(message);

                output.close();

                java.util.Scanner read = new java.util.Scanner(file);
                while (read.hasNext()) {
                    System.out.println(read.nextLine());
                }

            } catch (java.io.FileNotFoundException ex) {
                System.out.println("File not found");
            }
        }
    }


    
}
