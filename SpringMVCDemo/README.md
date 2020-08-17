# MVC 项目部署问题

## 错误1

一个或多个筛选器启动失败。完整的详细信息将在相应的容器日志文件中找到 29-Apr-2020 16:41:28.331 严重 [RMI TCP Connection(3)-127.0.0.1] org

### 如果是maven项目

https://blog.csdn.net/Ed12138/article/details/105843713

### 如果是gradle 

项目的发布目录为 SpringMVCDemo/out1， 

项目将编译后的jar拷贝发布目录下的 WEB-INF/lib 目录下 

然后将编译后的 classes 目录也拷贝发布项目的 WEB-INF 目录下


```bash
cp ./spring-beans/build/libs/spring-beans-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-aop/build/libs/spring-aop-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-context/build/libs/spring-context-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-core/build/libs/spring-core-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-expression/build/libs/spring-expression-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-jcl/build/libs/spring-jcl-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-web/build/libs/spring-web-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
cp ./spring-webmvc/build/libs/spring-webmvc-5.0.18.BUILD-SNAPSHOT.jar SpringMVCDemo/out1/WEB-INF/lib/
```

拷贝classes目录

```
cp -r SpringMVCDemo/build/classes/java/main/* SpringMVCDemo/out1/WEB-INF/classes

```


