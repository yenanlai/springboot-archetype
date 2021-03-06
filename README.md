# SpringBoot项目骨架

基础:
- 统一响应结果
- 统一异常处理
- 返回结果消息国际化
- [SpringBoot](https://spring.io/projects/spring-boot)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [MyBatis](http://www.mybatis.org/mybatis-3/zh/index.html)
- [Mybatis-Plus](https://mp.baomidou.com/guide/)
- [Guava](https://github.com/google/guava)
- [Swagger-UI](https://github.com/swagger-api/swagger-ui)
- HTTP Request日志采集
- 日期工具类

测试:
- H2数据库

自行拓展:
- [Redis](https://redis.io/)
- Kafka

提示:
- mv _gitignore .gitignore
- 重构package name

# Run

1. 项目启动，默认spring.profiles.active=local
2. 访问 http://localhost:2222/archetype/swagger-ui.html

# 构建Maven Archetype

Maven Deploy to Nexus:

- cd springboot-archetype
- mvn clean archetype:create-from-project
- cp ../pom_demo.xml target/generated-sources/archetype/pom.xml
- cd target/generated-sources/archetype/
- mvn -s YourSettings.xml clean deploy -U
