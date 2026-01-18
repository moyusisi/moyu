## common-core模块
基础模块

### 功能
* 定义了一些基本对象
* 定义了一些通用异常类和错误码

### 依赖
本模块需要如下依赖

```xml
    <dependencies>
        <!-- web依赖 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- jackson序列化 -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
        </dependency>
        <!-- mybatis-plus 增强CRUD 参考：https://baomidou.com/introduce/ -->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
        </dependency>
    </dependencies>
```