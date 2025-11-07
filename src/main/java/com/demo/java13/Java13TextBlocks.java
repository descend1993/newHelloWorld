package com.demo.java13;

/**
 * Java 13 文本块(Text Blocks)演示（预览特性）
 * 
 * Java 8的多行字符串限制：
 * - 必须使用字符串拼接：+ "\n" +
 * - 或使用String.join()、StringBuilder
 * - 需要手动转义引号和换行符
 * - 代码难以阅读和维护，特别是JSON、SQL、HTML等
 * 
 * Java 13引入的文本块（预览）：
 * - 使用三个双引号(""")开始和结束
 * - 自动处理换行符，保持代码格式
 * - 自动去除每行开头的公共缩进
 * - 不需要转义内部的双引号
 * - 保持代码可读性，所见即所得
 * 
 * 注意：
 * - Java 13/14是预览特性，需要--enable-preview
 * - Java 15正式发布为标准特性
 * - 文本块中的换行符在运行时会根据平台转换
 * 
 * 对Java 8用户的价值：
 * - 极大提升多行字符串的可读性
 * - 减少转义字符，减少错误
 * - 特别适合JSON、SQL、HTML、XML等格式
 */
public class Java13TextBlocks {
    public static void demo() {
        System.out.println("\n1. Text Blocks (Preview):");
        
        // Java 8写法：
        // String json = "{\n" +
        //               "    \"name\": \"Java 13\",\n" +
        //               "    \"version\": 13,\n" +
        //               "    \"features\": [\n" +
        //               "        \"Text Blocks\",\n" +
        //               "        \"Switch Expression Enhancements\"\n" +
        //               "    ]\n" +
        //               "}";
        
        // Java 13写法：使用文本块（三个双引号）
        // - 开头的"""必须独占一行
        // - 自动处理换行和缩进
        // - 不需要转义内部的双引号
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
        
        // 文本块特别适合HTML模板
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
