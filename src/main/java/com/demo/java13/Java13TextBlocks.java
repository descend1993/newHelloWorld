package com.demo.java13;

public class Java13TextBlocks {
    public static void demo() {
        System.out.println("\n1. Text Blocks (Preview):");
        
        String json = """
                {
                    "name": "Java 13",
                    "version": 13,
                    "features": [
                        "Text Blocks",
                        "Switch Expression Enhancements"
                    ]
                }
                """;
        
        System.out.println("  JSON Text Block:");
        System.out.println(json);
        
        String html = """
                <html>
                    <body>
                        <h1>Hello, Java 13!</h1>
                        <p>Text blocks make multiline strings easier!</p>
                    </body>
                </html>
                """;
        
        System.out.println("  HTML Text Block:");
        System.out.println(html);
    }
}
