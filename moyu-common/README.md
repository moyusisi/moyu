# moyu-common
通用包，内含多个不同的通用功能模块

## 打包部署

```bash
# 仅安装父pom
./mvnw clean install -N
# 安装指定模块
./mvnw clean install -pl common-core
# 安装指定模块
./mvnw clean install -pl common-authZ
```