# CODE_JAVA

---

 术语说明：块状结构(block-like construct)指的是一个类，方法或构造函数的主体。需要注意的是，数组初始化中的初始值可被选择性地视为块状结构(4.8.3.1节)。

## 1 ***标识符***

## 1.1 对所有标识符都通用的规则

标识符只能使用ASCII字母和数字，因此每个有效的标识符名称都能匹配正则表达式\w+。

在Google其它编程语言风格中使用的特殊前缀或后缀，如name_, mName, s_name和kName，在Java编程风格中都不再使用。

## 1.2 标识符类型的规则

### 1.2.1 包名

包名全部小写，连续的单词只是简单地连接起来，不使用下划线。


### 1.2.2 类名

类名都以UpperCamelCase风格编写。

类名通常是名词或名词短语，接口名称有时可能是形容词或形容词短语。现在还没有特定的规则或行之有效的约定来命名注解类型。

测试类的命名以它要测试的类的名称开始，以Test结束。例如，HashTest或HashIntegrationTest。

### 1.2.3 方法名

方法名都以lowerCamelCase风格编写。

方法名通常是动词或动词短语。

下划线可能出现在JUnit测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，例如testPop_emptyStack。 并不存在唯一正确的方式来命名测试方法。

### 1.2.4 常量名

常量名命名模式为CONSTANT_CASE，全部字母大写，用下划线分隔单词。那，到底什么算是一个常量？

每个常量都是一个**静态final**字段，但不是所有静态final字段都是常量。在决定一个字段是否是一个常量时， 考虑它是否真的感觉像是一个常量。例如，如果任何一个该实例的观测状态是可变的，则它几乎肯定不会是一个常量。 只是永远不打算改变对象一般是不够的，它要真的一直不变才能将它示为常量。

```java
// Constants
static final int NUMBER = 1;
static final ImmutableList<String> NAMES = ImmutableList.of("Ed", "Ann");
static final Joiner COMMA_JOINER = Joiner.on(',');  // because Joiner is immutable
static final SomeMutableType[] EMPTY_ARRAY = {};
enum SomeEnum { ENUM_CONSTANT }

// Not constants
static String nonFinal = "non-final";
final String nonStatic = "non-static";
static final Set<String> mutableCollection = new HashSet<String>();
static final ImmutableSet<SomeMutableType> mutableElements = ImmutableSet.of(mutable);
static final Logger logger = Logger.getLogger(MyClass.getName());
static final String[] nonEmptyArray = {"these", "can", "change"};
```

这些名字通常是名词或名词短语。

## 1.2.5 非常量字段名

非常量字段名以lowerCamelCase风格编写。

这些名字通常是名词或名词短语。

## 1.2.6 参数名

参数名以lowerCamelCase风格编写。

参数应该避免用单个字符命名。

## 1.2.7 局部变量名

局部变量名以lowerCamelCase风格编写，比起其它类型的名称，局部变量名可以有更为宽松的缩写。

虽然缩写更宽松，但还是要避免用单字符进行命名，除了临时变量和循环变量。

即使局部变量是final和不可改变的，也不应该把它示为常量，自然也不能用常量的规则去命名它。

## 1.2.8 类型变量名

类型变量可用以下两种风格之一进行命名：

单个的大写字母，后面可以跟一个数字(如：E, T, X, T2)。
以类命名方式(1.2.2节)，后面加个大写的T(如：RequestT, FooBarT)。
1.3 驼峰式命名法(CamelCase)
驼峰式命名法分大驼峰式命名法(UpperCamelCase)和小驼峰式命名法(lowerCamelCase)。 有时，我们有不只一种合理的方式将一个英语词组转换成驼峰形式，如缩略语或不寻常的结构(例如"IPv6"或"iOS")。Google指定了以下的转换方案。

名字从散文形式(prose form)开始:

把短语转换为纯ASCII码，并且移除任何单引号。例如："Müller’s algorithm"将变成"Muellers algorithm"。
把这个结果切分成单词，在空格或其它标点符号(通常是连字符)处分割开。
推荐：如果某个单词已经有了常用的驼峰表示形式，按它的组成将它分割开(如"AdWords"将分割成"ad words")。 需要注意的是"iOS"并不是一个真正的驼峰表示形式，因此该推荐对它并不适用。
现在将所有字母都小写(包括缩写)，然后将单词的第一个字母大写：最后将所有的单词连接起来得到一个标识符。
每个单词的第一个字母都大写，来得到大驼峰式命名。
除了第一个单词，每个单词的第一个字母都大写，来得到小驼峰式命名。
示例：


```java
Prose form                Correct               Incorrect
------------------------------------------------------------------
"XML HTTP request"        XmlHttpRequest        XMLHTTPRequest
"new customer ID"         newCustomerId         newCustomerID
"inner stopwatch"         innerStopwatch        innerStopWatch
"supports IPv6 on iOS?"   supportsIpv6OnIos     supportsIPv6OnIOS
"YouTube importer"        YouTubeImporter
                          YoutubeImporter*
```

加星号处表示可以，但不推荐。

Note：在英语中，某些带有连字符的单词形式不唯一。例如："nonempty"和"non-empty"都是正确的，因此方法名checkNonempty和checkNonEmpty也都是正确的。

---

## 2 ***命令***

### 2.1 javac命令 编译.java -> 生成.class文件

```bash
javac [options] <source files>
```

### 2.2 java命令 执行一个类

```bash
# (to execute a class)
java [options] <mainclass> [args...]
# (to execute a jar file)
java [options] -m <module>[/<mainclass>] [args...]
```

### 2.3 jar命令 打包.class -> .jar

```bash
jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files ...

# Example 1: to archive two class files into an archive called classes.jar:
       jar cvf classes.jar Foo.class Bar.class

# Example 2: use an existing manifest file 'mymanifest' and archive all the files in the foo/ directory into 'classes.jar':
       jar cvfm classes.jar mymanifest -C foo/ .
```

### 2.4 javadoc命令 生成文档

```bash
javadoc [options] [packagenames] [sourcefiles] [@files]
```
