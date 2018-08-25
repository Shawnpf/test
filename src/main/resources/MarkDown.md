[TOC]
#  MarkDown语法
###  1 粗体斜体

*斜体*
**粗体**
***加粗斜体***
~~删除线~~


### 2 标题{#index}

![a1495bc8fda335f36680713ce85ece06.png](evernotecid://5037E3CD-68ED-4D88-A0A7-D94DB419A21A/appyinxiangcom/15888468/ENResource/p79)

### 3 链接

#### 3.1 行内式
链接[google](www.google.com)
鼠标悬停[谷歌](www.google.com "www.google.com")

#### 3.2 参考式
经常去的几个网站[google.com][1]、[youtube.com][2]和[facebook.com][3]，还有一个网站[网站][]

[1]:www.google.com "Google"
[2]:www.youtube.com "Youtube"
[3]:www.facebook.com "Facebook"
[网站]:www.baidu.com

#### 3.3 自动链接
<http://www.example.com>
<shangpf@163.com>


### 4 锚点

跳转到[标题](#index)

### 5 列表

#### 5.1 无序列表
使用*，+，-表示无序列表
- 第一个
- 第二个
- 第三个
* one
* two
#### 5.2 有序列表
数字接一个英文句点
1. 有序的 一
2. 有序的 二
3. 有序的 三
#### 5.3 定义型列表
定义型列表由名词和解释组成。一行写上定义，紧跟一行写上解释。解释的写法:紧跟一个缩进(Tab)

Markdown
:   轻量级文本标记语言，可以转换成html，pdf等格式（左侧有一个可见的冒号和四个不可见的空格）
代码块 2
:   这是代码块的定义（左侧有一个可见的冒号和四个不可见的空格）
        代码块（左侧有八个不可见的空格）
        
#### 5.4 列表缩进
*   轻轻的我走了， 正如我轻轻的来； 我轻轻的招手， 作别西天的云彩。
*   那榆荫下的一潭， 不是清泉， 是天上虹； 揉碎在浮藻间， 沉淀着彩虹似的梦。 
#### 5.5 包含段落的列表
*   轻轻的我走了， 正如我轻轻的来； 我轻轻的招手， 作别西天的云彩。
     那榆荫下的一潭， 不是清泉， 是天上虹； 揉碎在浮藻间， 沉淀着彩虹似的梦。  
*    悄悄的我走了， 正如我悄悄的来； 我挥一挥衣袖， 不带走一片云彩。

#### 5.6 包含引用的列表
*   阅读的方法:
    > 打开书本。
    > 打开电灯。

#### 5.7 代码区块
缩进两次

        <代码写在这>

### 6 引用
引用需要在被引用的文本前加上>符号。

### 7 插入图像
![图片Alt](图片地址 “图片Title”)
如果图片因为某些原因不能显示，就用定义的图片Alt文字来代替图片。 图片Title则和链接中的Title一样，表示鼠标悬停与图片上时出现的文字。 Alt 和 Title 都不是必须的，可以省略，但建议写上。

Google：
![Google](https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png "Google")

在文档要插入图片的地方写![图片Alt][标记]

在文档的最后写上[标记]:图片地址 “Title”

### 8 目录内容
在段落中填写 [TOC] 以显示全文内容的目录结构。

### 9 注脚
在需要添加注脚的文字后加上脚注名字[^注脚名字],称为加注。 然后在文本的任意位置(一般在最后)添加脚注，脚注前必须有对应的脚注名字。

注意：经测试注脚与注脚之间必须空一行，不然会失效。成功后会发现，即使你没有把注脚写在文末，经Markdown转换后，也会自动归类到文章的最后。

使用 Markdown[^1]可以效率的书写文档, 直接转换成 HTML[^2], 你可以使用 Leanote[^Le] 编辑器进行书写。

[^1]:Markdown是一种纯文本标记语言

[^2]:HyperText Markup Language 超文本标记语言

[^Le]:开源笔记平台，支持Markdown和笔记直接发为博文

### 10 公式
[MathJax](http://meta.math.stackexchange.com/questions/5020/mathjax-basic-tutorial-and-quick-reference "http://meta.math.stackexchange.com/questions/5020/mathjax-basic-tutorial-and-quick-reference")
### 11 流程图

[http://flowchart.js.org/](http://adrai.github.io/flowchart.js/ "http://adrai.github.io/flowchart.js/")

### 12 表格
简单
学号|姓名|分数
-|-|-
010|小明|90
012|小红|95
原生
|学号|姓名|分数|
|-|-|-|
|010|小明|90|
|012|小红|95|
指定方向
学号学号|姓名姓名|分数分数
-:|-:|-:
010|小明|90
012|小红|95

### 13 分隔线

* * *
***
*****
- - -
---------------------------------------

### 14 代码
缩进
符号

行内
C语言里的函数 `scanf()` 怎么使用？

缩进多行

    #include <stdio.h>
    int main(void)
    {
        printf("Hello world\n");
    }

``` c
#include <stdio.h>
int main(void)
{
    printf("Hello world\n");
}
```

``` java
    class HelloWorld {
        public static void main(String[] args) {
        System.out.println("Hello World");
    }
    }
```

```

HTML原始码

<div class="footer">
   © 2004 Foo Corporation
</div>


<table>
    <tr>
        <th rowspan="2">值班人员</th>
        <th>星期一</th>
        <th>星期二</th>
        <th>星期三</th>
    </tr>
    <tr>
        <td>李强</td>
        <td>张明</td>
        <td>王平</td>
    </tr>
</table>





