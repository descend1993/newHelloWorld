# Java 9-21 Features Demo

这个项目展示了从Java 9到Java 21的所有主要新特性。

## 项目结构

```
src/main/java/com/demo/
├── JavaFeaturesDemo.java         # 主程序入口
├── java9/                         # Java 9 特性
│   ├── Java9CollectionFactory.java
│   ├── Java9PrivateInterfaceMethods.java
│   ├── Java9StreamEnhancements.java
│   ├── Java9OptionalEnhancements.java
│   └── Java9ProcessAPI.java
├── java10/                        # Java 10 特性
│   ├── Java10VarKeyword.java
│   └── Java10CollectionCopyOf.java
├── java11/                        # Java 11 特性 (LTS)
│   ├── Java11StringMethods.java
│   ├── Java11FileMethods.java
│   ├── Java11HttpClient.java
│   └── Java11VarInLambda.java
├── java12/                        # Java 12 特性
│   ├── Java12SwitchExpression.java
│   ├── Java12StringMethods.java
│   └── Java12CollectionTeeing.java
├── java13/                        # Java 13 特性
│   └── Java13TextBlocks.java
├── java14/                        # Java 14 特性
│   ├── Java14SwitchExpression.java
│   ├── Java14NullPointerException.java
│   ├── Java14Records.java
│   └── Java14PatternMatching.java
├── java15/                        # Java 15 特性
│   ├── Java15TextBlocks.java
│   └── Java15SealedClasses.java
├── java16/                        # Java 16 特性
│   ├── Java16Records.java
│   ├── Java16PatternMatching.java
│   └── Java16StreamToList.java
├── java17/                        # Java 17 特性 (LTS)
│   ├── Java17SealedClasses.java
│   └── Java17RandomGenerator.java
├── java18/                        # Java 18 特性
│   ├── Java18UTF8Default.java
│   └── Java18SimpleWebServer.java
├── java19/                        # Java 19 特性
│   ├── Java19VirtualThreads.java
│   └── Java19PatternMatching.java
├── java20/                        # Java 20 特性
│   ├── Java20ScopedValues.java
│   └── Java20RecordPatterns.java
└── java21/                        # Java 21 特性 (LTS)
    ├── Java21PatternMatching.java
    ├── Java21SequencedCollections.java
    ├── Java21StringTemplates.java
    └── Java21VirtualThreads.java
```

## 特性概览

### Java 9
- ✅ Collection工厂方法 (List.of, Set.of, Map.of)
- ✅ 接口私有方法
- ✅ Stream API增强 (takeWhile, dropWhile, iterate)
- ✅ Optional增强 (ifPresentOrElse, or, stream)
- ✅ Process API增强
- ✅ 模块系统 (Project Jigsaw)

### Java 10
- ✅ 局部变量类型推断 (var关键字)
- ✅ Collection.copyOf()方法

### Java 11 (LTS)
- ✅ 新String方法 (strip, isBlank, lines, repeat)
- ✅ 文件读写方法 (Files.readString, Files.writeString)
- ✅ 标准HTTP客户端
- ✅ Lambda参数的var

### Java 12
- ✅ Switch表达式 (预览)
- ✅ String方法 (indent, transform)
- ✅ Teeing收集器

### Java 13
- ✅ 文本块 (预览)

### Java 14
- ✅ Switch表达式 (标准)
- ✅ 有用的NullPointerException
- ✅ Records (预览)
- ✅ instanceof的模式匹配 (预览)

### Java 15
- ✅ 文本块 (标准)
- ✅ 密封类 (预览)

### Java 16
- ✅ Records (标准)
- ✅ instanceof的模式匹配 (标准)
- ✅ Stream.toList()

### Java 17 (LTS)
- ✅ 密封类 (标准)
- ✅ 增强的随机数生成器API

### Java 18
- ✅ 默认UTF-8编码
- ✅ 简单Web服务器

### Java 19
- ✅ 虚拟线程 (预览)
- ✅ 模式匹配增强 (预览)

### Java 20
- ✅ 作用域值 (预览)
- ✅ Record模式 (预览)

### Java 21 (LTS)
- ✅ Switch的模式匹配 (标准)
- ✅ 顺序集合
- ✅ 字符串模板 (预览)
- ✅ 虚拟线程 (标准)

## 编译和运行

### 使用Maven

```bash
# 编译
mvn clean compile

# 打包
mvn package

# 运行
java -jar target/java-features-demo-1.0.0.jar

# 或直接运行
mvn exec:java -Dexec.mainClass="com.demo.JavaFeaturesDemo"
```

### 使用Java命令

```bash
# 编译
javac -d target/classes --enable-preview --source 21 src/main/java/com/demo/**/*.java

# 运行
java -cp target/classes --enable-preview com.demo.JavaFeaturesDemo
```

## 系统要求

- Java 21 或更高版本
- Maven 3.6+ (可选)

## 注意事项

- 某些特性（如虚拟线程、字符串模板）在早期版本中是预览特性，需要使用 `--enable-preview` 标志
- HTTP客户端演示可能在离线环境中失败，这是正常的
- 简单Web服务器演示不会实际启动服务器，以避免阻塞程序执行

## 学习资源

- [OpenJDK官方网站](https://openjdk.org/)
- [Java语言规范](https://docs.oracle.com/javase/specs/)
- [JEP索引](https://openjdk.org/jeps/0)

## 许可证

本项目仅用于教育和演示目的。
