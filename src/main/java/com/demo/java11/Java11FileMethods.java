package com.demo.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java11FileMethods {
    public static void demo() {
        System.out.println("\n2. File Methods:");
        
        try {
            Path tempFile = Files.createTempFile("demo", ".txt");
            String content = "Hello from Java 11!\nNew file methods are great!";
            
            Files.writeString(tempFile, content);
            System.out.println("  Written to file: " + tempFile);
            
            String readContent = Files.readString(tempFile);
            System.out.println("  Read from file:");
            System.out.println("    " + readContent.replace("\n", "\n    "));
            
            Files.deleteIfExists(tempFile);
            System.out.println("  Temporary file deleted");
        } catch (IOException e) {
            System.out.println("  Error: " + e.getMessage());
        }
    }
}
