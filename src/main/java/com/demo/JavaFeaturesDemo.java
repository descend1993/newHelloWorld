package com.demo;

import com.demo.java9.*;
import com.demo.java10.*;
import com.demo.java11.*;
import com.demo.java12.*;
import com.demo.java13.*;
import com.demo.java14.*;
import com.demo.java15.*;
import com.demo.java16.*;
import com.demo.java17.*;
import com.demo.java18.*;
import com.demo.java19.*;
import com.demo.java20.*;
import com.demo.java21.*;

/**
 * Java 9-21 新特性演示程序
 * 
 * 本项目为Java 8用户提供了一个全面的指南，展示了从Java 9到Java 21的所有主要新特性。
 * 每个特性都包含详细的代码示例和注释，帮助您理解这些新特性如何改进和简化Java开发。
 * 
 * 如果您目前使用Java 8，建议按照版本顺序逐步学习：
 * 1. Java 9-11: 基础改进（集合工厂、var关键字、字符串方法等）
 * 2. Java 12-16: 语法增强（switch表达式、text blocks、records等）
 * 3. Java 17: 第一个推荐升级的LTS版本
 * 4. Java 21: 最新的LTS版本，包含虚拟线程等重大特性
 * 
 * @author Java Features Demo Team
 * @since 1.0.0
 */
public class JavaFeaturesDemo {
    public static void main(String[] args) {
        System.out.println("=".repeat(80));
        System.out.println("Java 9-21 New Features Demo");
        System.out.println("=".repeat(80));
        System.out.println();

        runJava9Features();
        runJava10Features();
        runJava11Features();
        runJava12Features();
        runJava13Features();
        runJava14Features();
        runJava15Features();
        runJava16Features();
        runJava17Features();
        runJava18Features();
        runJava19Features();
        runJava20Features();
        runJava21Features();

        System.out.println();
        System.out.println("=".repeat(80));
        System.out.println("Demo completed successfully!");
        System.out.println("=".repeat(80));
    }

    private static void runJava9Features() {
        printHeader("Java 9 Features");
        Java9CollectionFactory.demo();
        Java9PrivateInterfaceMethods.demo();
        Java9StreamEnhancements.demo();
        Java9OptionalEnhancements.demo();
        Java9ProcessAPI.demo();
    }

    private static void runJava10Features() {
        printHeader("Java 10 Features");
        Java10VarKeyword.demo();
        Java10CollectionCopyOf.demo();
    }

    private static void runJava11Features() {
        printHeader("Java 11 Features");
        Java11StringMethods.demo();
        Java11FileMethods.demo();
        Java11HttpClient.demo();
        Java11VarInLambda.demo();
    }

    private static void runJava12Features() {
        printHeader("Java 12 Features");
        Java12SwitchExpression.demo();
        Java12StringMethods.demo();
        Java12CollectionTeeing.demo();
    }

    private static void runJava13Features() {
        printHeader("Java 13 Features");
        Java13TextBlocks.demo();
    }

    private static void runJava14Features() {
        printHeader("Java 14 Features");
        Java14SwitchExpression.demo();
        Java14NullPointerException.demo();
        Java14Records.demo();
        Java14PatternMatching.demo();
    }

    private static void runJava15Features() {
        printHeader("Java 15 Features");
        Java15TextBlocks.demo();
        Java15SealedClasses.demo();
    }

    private static void runJava16Features() {
        printHeader("Java 16 Features");
        Java16Records.demo();
        Java16PatternMatching.demo();
        Java16StreamToList.demo();
    }

    private static void runJava17Features() {
        printHeader("Java 17 (LTS) Features");
        Java17SealedClasses.demo();
        Java17RandomGenerator.demo();
    }

    private static void runJava18Features() {
        printHeader("Java 18 Features");
        Java18UTF8Default.demo();
        Java18SimpleWebServer.demo();
    }

    private static void runJava19Features() {
        printHeader("Java 19 Features");
        Java19VirtualThreads.demo();
        Java19PatternMatching.demo();
    }

    private static void runJava20Features() {
        printHeader("Java 20 Features");
        Java20ScopedValues.demo();
        Java20RecordPatterns.demo();
    }

    private static void runJava21Features() {
        printHeader("Java 21 (LTS) Features");
        Java21PatternMatching.demo();
        Java21SequencedCollections.demo();
        Java21StringTemplates.demo();
        Java21VirtualThreads.demo();
    }

    private static void printHeader(String title) {
        System.out.println();
        System.out.println("-".repeat(80));
        System.out.println(title);
        System.out.println("-".repeat(80));
    }
}
