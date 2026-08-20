## common-core模块
基础模块

### 功能
* 定义了一些基本对象
* 定义了一些通用异常类和错误码

### 依赖
本模块需要如下依赖
* 日志输出json格式需要jackson组件(包含在spring-web中)
* 定义了基础实体对象，需要mybatis-plus组件
* 使用了切面拦截，需要spring-aop

```xml
    <dependencies>
        <!-- web依赖 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>
        <!-- mybatis-plus 增强CRUD 参考：https://baomidou.com/introduce/ -->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
        </dependency>
    </dependencies>
```