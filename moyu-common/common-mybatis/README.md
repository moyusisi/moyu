## mybatis-flex组件

### 功能
* 数据实体`BaseEntity`公共字段的填充处理功能
* 提供了编程式数据权限处理工具

### 说明
使用`MyBatis-Flex`组件

### 依赖
本组件对于`common-authZ`的依赖主要用于数据范围处理

本模块需要如下依赖

```xml

<dependencies>
    <!-- common-authZ -->
    <dependency>
        <groupId>com.moyu</groupId>
        <artifactId>common-authZ</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
    <!-- MyBatis-Flex MyBatis的轻量增强框架 参考 https://mybatis-flex.com/zh/intro/comparison.html -->
    <dependency>
        <groupId>com.mybatis-flex</groupId>
        <artifactId>mybatis-flex-spring-boot-starter</artifactId>
        <version>1.11.8</version>
    </dependency>
</dependencies>
```

### 使用
在SpringBoot项目的配置文件，正常添加数据源配置、mybatis-flex配置即可

```yaml
# spring配置
spring:
  # 数据源配置
  datasource:
    url: jdbc:mysql://127.0.0.1/yourDB?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=utf8
    username: xxx
    password: xxx
    driver-class-name: com.mysql.cj.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource

# MyBatis-Flex配置 参考：https://mybatis-flex.com/zh/base/configuration.html
mybatis-flex:
  # 配置mapper的扫描，如果在 Mapper 中有自定义方法，需要配置此项。 默认值：["classpath*:/mapper/**/*.xml"]
  mapper-locations: classpath*:mapper/**/*.xml
  # 加载全局的配置文件
#  config-location: classpath:mybatis-config.xml
  global-config:
    # 关闭控制台输出banner
    print-banner: false
```