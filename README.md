# SpringBoot项目骨架

基础:
- 统一响应结果
- 统一异常处理
- 返回结果语言国际化
- Swagger
- Spring Cloud Feign
- Spring Cloud Eureka
- Spring Cloud Config
- Guava Loading Cache
- Mybatis通用Mapper
- Mybatis Generator自动生成代码插件
- PageHelper分页插件
- HTTP Request日志打印
- Date工具类

测试:
- H2数据库

拓展:
- Redis
- Kafka

提示:
- mv _gitignore .gitignore
- 重构package name

# 测试

1. 项目启动，默认spring.profiles.active=local
2. 访问 http://localhost:2222/archetype/swagger-ui.html

# 构建Maven Archetype

Maven Deploy to Nexus:

- cd springboot-archetype
- mvn clean archetype:create-from-project
- cp ../pom_demo.xml target/generated-sources/archetype/pom.xml
- cd target/generated-sources/archetype/
- mvn -s YourSettings.xml clean deploy -U
