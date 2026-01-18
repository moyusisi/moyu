## security组件包

同时集成了 Spring-Security 和 Sa-Token
强依赖redis

### 功能
* SpringSecurity自动配置类
* 认证异常、授权异常统一处理
* 认证过滤器(用于获取认证令牌及用户信息存入上下文)
* 登陆用户信息对象LoginUser及上下文工具类
* Jwt、Token等令牌处理Service
