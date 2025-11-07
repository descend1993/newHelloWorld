package com.demo.java18;

import java.nio.charset.Charset;

public class Java18UTF8Default {
    public static void demo() {
        System.out.println("\n1. UTF-8 by Default:");
        
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("  Default Charset: " + defaultCharset);
        System.out.println("  Display Name: " + defaultCharset.displayName());
        
        String text = "Hello, 世界! 🌍";
        System.out.println("  Unicode text: " + text);
        byte[] bytes = text.getBytes();
        System.out.println("  Byte length: " + bytes.length);
    }
}
