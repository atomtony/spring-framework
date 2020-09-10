# MVC 项目部署问题

## 错误1

一个或多个筛选器启动失败。完整的详细信息将在相应的容器日志文件中找到 29-Apr-2020 16:41:28.331 严重 [RMI TCP Connection(3)-127.0.0.1] org

### 如果是maven项目

https://blog.csdn.net/Ed12138/article/details/105843713

### 如果是gradle 

修改 dist.sh 为可执行权限，修改文档前几行的变量，然后在IDE中右击运行，


