# Java 9-21 特性详细列表

## Java 9 (2017年9月)

### 主要特性
1. **模块系统 (Project Jigsaw)** - Java平台模块系统
2. **JShell** - Java交互式命令行工具
3. **集合工厂方法** - List.of(), Set.of(), Map.of()
4. **接口私有方法** - 接口中可以定义private方法
5. **Stream API增强**
   - takeWhile() - 从流中获取元素直到条件为false
   - dropWhile() - 跳过元素直到条件为false
   - iterate() - 带条件的iterate
   - ofNullable() - 从可能为null的值创建流
6. **Optional增强**
   - ifPresentOrElse()
   - or()
   - stream()
7. **Process API增强** - 更好的进程管理API
8. **改进的@Deprecated注解**
9. **多版本JAR文件**
10. **统一JVM日志**

---

## Java 10 (2018年3月)

### 主要特性
1. **局部变量类型推断 (var)** - 自动推断局部变量类型
2. **应用程序类数据共享 (AppCDS)**
3. **垃圾收集器改进**
4. **并行Full GC for G1**
5. **集合copyOf()方法** - 创建不可变副本
6. **Optional.orElseThrow()**

---

## Java 11 (2018年9月) - LTS

### 主要特性
1. **新的String方法**
   - strip(), stripLeading(), stripTrailing()
   - isBlank()
   - lines()
   - repeat()
2. **文件读写方法**
   - Files.readString()
   - Files.writeString()
3. **标准HTTP客户端** - java.net.http包
4. **Lambda参数的var** - 可以在lambda表达式中使用var
5. **运行单文件源代码程序** - java HelloWorld.java
6. **Epsilon垃圾收集器** - 无操作GC
7. **ZGC** - 可扩展的低延迟垃圾收集器(实验性)
8. **移除Java EE和CORBA模块**
9. **废弃Nashorn JavaScript引擎**
10. **飞行记录器 (Flight Recorder)**

---

## Java 12 (2019年3月)

### 主要特性
1. **Switch表达式 (预览)** - switch可以作为表达式使用
2. **Shenandoah垃圾收集器** - 低暂停时间GC
3. **JVM常量API**
4. **String方法**
   - indent()
   - transform()
5. **Collectors.teeing()** - 组合两个收集器
6. **CompactNumberFormat** - 紧凑数字格式化

---

## Java 13 (2019年9月)

### 主要特性
1. **文本块 (预览)** - 多行字符串字面量
2. **Switch表达式增强 (预览)** - yield关键字
3. **动态CDS归档**
4. **重新实现旧版Socket API**
5. **ZGC改进** - 返回未使用的内存给操作系统

---

## Java 14 (2020年3月)

### 主要特性
1. **Switch表达式 (标准)** - 正式特性
2. **Records (预览)** - 不可变数据类
3. **instanceof的模式匹配 (预览)** - 类型匹配和转换
4. **有用的NullPointerException** - 详细的NPE信息
5. **文本块改进 (预览)**
6. **打包工具 (jpackage, 孵化)** - 创建平台特定的安装程序
7. **JFR事件流**
8. **删除CMS垃圾收集器**

---

## Java 15 (2020年9月)

### 主要特性
1. **文本块 (标准)** - 正式特性
2. **密封类 (预览)** - 限制类的继承
3. **隐藏类**
4. **Records (第二次预览)**
5. **instanceof的模式匹配 (第二次预览)**
6. **ZGC和Shenandoah正式化**
7. **废弃和删除Nashorn JavaScript引擎**
8. **重新实现DatagramSocket API**
9. **外部内存访问API (孵化)**

---

## Java 16 (2021年3月)

### 主要特性
1. **Records (标准)** - 正式特性
2. **instanceof的模式匹配 (标准)** - 正式特性
3. **密封类 (第二次预览)**
4. **外部链接器API (孵化)**
5. **外部内存访问API (第三次孵化)**
6. **Vector API (孵化)** - SIMD向量计算
7. **在JDK中启用C++14功能**
8. **Stream.toList()** - 便捷方法
9. **Unix域套接字通道**
10. **弹性元空间**

---

## Java 17 (2021年9月) - LTS

### 主要特性
1. **密封类 (标准)** - 正式特性
2. **增强的随机数生成器API** - RandomGenerator接口
3. **新的macOS渲染管线**
4. **删除实验性AOT和JIT编译器**
5. **废弃Applet API**
6. **强封装JDK内部API**
7. **外部函数和内存API (孵化)**
8. **Vector API (第二次孵化)**
9. **Context-Specific反序列化过滤器**

---

## Java 18 (2022年3月)

### 主要特性
1. **默认UTF-8编码** - 标准字符集为UTF-8
2. **简单Web服务器** - jwebserver命令行工具
3. **代码片段JavaDoc标签** - @snippet标签
4. **使用方法句柄重新实现核心反射**
5. **Vector API (第三次孵化)**
6. **外部函数和内存API (第二次孵化)**
7. **互联网地址解析SPI**
8. **Switch的模式匹配 (第二次预览)**
9. **废弃finalization机制**

---

## Java 19 (2022年9月)

### 主要特性
1. **虚拟线程 (预览)** - 轻量级线程
2. **结构化并发 (孵化)** - 简化并发编程
3. **外部函数和内存API (预览)**
4. **Vector API (第四次孵化)**
5. **Switch的模式匹配 (第三次预览)**
6. **Record模式 (预览)** - 解构Record
7. **Linux/RISC-V移植**

---

## Java 20 (2023年3月)

### 主要特性
1. **作用域值 (孵化)** - 线程间共享不可变数据
2. **Record模式 (第二次预览)**
3. **Switch的模式匹配 (第四次预览)**
4. **外部函数和内存API (第二次预览)**
5. **虚拟线程 (第二次预览)**
6. **结构化并发 (第二次孵化)**
7. **Vector API (第五次孵化)**

---

## Java 21 (2023年9月) - LTS

### 主要特性
1. **虚拟线程 (标准)** - 正式特性，大幅提升并发性能
2. **Switch的模式匹配 (标准)** - 正式特性
3. **Record模式 (标准)** - 正式特性
4. **顺序集合** - 新的集合接口(SequencedCollection)
   - getFirst(), getLast()
   - addFirst(), addLast()
   - reversed()
5. **字符串模板 (预览)** - 更安全的字符串组合
6. **未命名模式和变量 (预览)** - 使用下划线表示未使用的变量
7. **未命名类和实例main方法 (预览)** - 简化Hello World
8. **作用域值 (预览)**
9. **结构化并发 (预览)**
10. **Vector API (第六次孵化)**
11. **外部函数和内存API (第三次预览)**
12. **分代ZGC** - 改进的Z垃圾收集器
13. **废弃32位x86移植**
14. **准备禁止动态加载代理**

---

## LTS版本时间线

- **Java 8 (LTS)**: 2014年3月 - 支持至2030年
- **Java 11 (LTS)**: 2018年9月 - 支持至2026年
- **Java 17 (LTS)**: 2021年9月 - 支持至2029年
- **Java 21 (LTS)**: 2023年9月 - 支持至2031年

## 特性状态说明

- **标准**: 正式特性，可以在生产环境使用
- **预览**: 完整但未最终确定的特性，需要--enable-preview标志
- **孵化**: 实验性API，可能会有重大变化
- **废弃**: 计划在未来版本中删除的特性

## 推荐阅读

- [OpenJDK项目](https://openjdk.org/)
- [JEP (JDK Enhancement Proposal) 索引](https://openjdk.org/jeps/0)
- [Java版本发布历史](https://en.wikipedia.org/wiki/Java_version_history)
