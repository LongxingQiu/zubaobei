运行环境：JDK 8 或 9，Maven 3.0+
技术栈：Spring Cloud Finchley.SR2、 Spring Boot 2.0.7.RELEASE

项目依赖
spring-cloud 版本：Finchley.SR2
spring-boot 版本：2.0.7.RELEASE


zubaobei-eureka
服务注册中心
端口：8761
监控地址： http://127.0.0.1:8761

zubaobei-gateway
服务网关中心
端口：8000
测试接口：http://localhost:8000/v1/api/person/2340999999 测试转发到zubaobei-eureka-service-invoker

zubaobei-eureka-service-provider
eureka服务提供者demo
端口：8762
测试接口：http://127.0.0.1:8762/person/1234

zubaobei-eureka-service-invoker
eureka服务调用者demo
端口：9000
http://127.0.0.1:9000/api/person/23409012902

zubaobei-common 公共模块

zubaobei-mybatis-demo mybatis整合demo模块