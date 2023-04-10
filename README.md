# 众享 API接口开发平台

## 项目介绍
一个提供 API 接口供开发者调用的平台。
管理员可以接入并发布接口，统计分析各接口调用情况；用户可以注册登录并开通接口调用权限，然后可以浏览接口及在线调试，还能使用客户端 SDK 轻松在代码中调用接口。

## 业务流程
![image](https://user-images.githubusercontent.com/94662685/230849728-0f8cd19a-14a9-46a6-b738-75be37412032.png)


## 技术选型
### 后端
-   Java Spring Boot
-   MySQL 数据库
-   MyBatis-Plus 及 MyBatis X 自动生成
-   API 签名认证（Http 调用）
-   Spring Boot Starter（SDK 开发）
-   Dubbo 分布式（RPC、Nacos）
-   Swagger + Knife4j 接口文档生成
-   Spring Cloud Gateway 微服务网关
-   Hutool、Apache Common Utils、Gson 等工具库

### 前端
-   React 18
-   Ant Design Pro 5.x 脚手架
-   Ant Design & Procomponents 组件库
-   Umi 4 前端框架
-   OpenAPI 前端代码生成
