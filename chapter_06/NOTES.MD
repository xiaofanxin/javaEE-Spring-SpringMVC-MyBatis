### MyBatis的工作原理
+ 读取MyBatis的配置文件mybatis-config.xml
+ 加载映射文件Mapper.xml
+ 构造会话工厂SqlSessionFactory
+ 创建会话对象SqlSession
+ Executer执行器
+ MappedStatement对象
+ 输入映射
+ 输出映射

![MyBatis工作原理](https://github.com/xiaofanxin/image/blob/master/MyBatis%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86.png?raw=true)

### 一般在项目中的步骤
1.读取配置文件  
2.根据配置文件构建SqlSessionFactory  
3.通过SqlSessionFactory创建SqlSession  
4.使用SqlSession对象操作数据库（包括查询、添加、修改、删除以及事务提交等）  
5.关闭SqlSession



