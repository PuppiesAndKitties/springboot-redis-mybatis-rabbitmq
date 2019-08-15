# springboot-redis-mybatis-rabbitmq
Springboot + Redis + Mybatis + RabbitMQ

If you want to build this project step by step from nothing, do as following:

Install Redis : https://www.cnblogs.com/zongfa/p/7808807.html
Install RabbitMQ : https://blog.csdn.net/qq_22638399/article/details/81704372

0.  Learn Redis' basic Usage:  https://www.bilibili.com/video/av49745263?from=search&seid=15892372175746449296
1.  Learn How to Merge Mybatis and Redis: https://github.com/JeffLi1993/springboot-learning-example/tree/master/springboot-mybatis-redis 
2. Merge RabbitMQ into project:
   2.1 create a package messagequeue in current project and do as: https://blog.csdn.net/qq_38455201/article/details/80308771
   2.2 in CityServiceImpl.java add method: getAllCities()  


从零开始一步一步建立整个工程：
安装 Redis : https://www.cnblogs.com/zongfa/p/7808807.html
安装 RabbitMQ : https://blog.csdn.net/qq_22638399/article/details/81704372

0.  学习Redis的基础用法:  https://www.bilibili.com/video/av49745263?from=search&seid=15892372175746449296
1.  如何创建一个Springboot工程并且整合redis和mybatis: https://github.com/JeffLi1993/springboot-learning-example/tree/master/springboot-mybatis-redis 
2.  将RabbitMQ整合入Springboot+mybatis+redis的工程中:
   2.1 在工程中创建一个package然后根据下文做: https://blog.csdn.net/qq_38455201/article/details/80308771
   2.2 在CityServiceImpl.java中添加方法: getAllCities() ，该方法调用producer。
