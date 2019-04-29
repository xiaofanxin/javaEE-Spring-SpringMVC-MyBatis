### 思考题  
1.请简述MyBatis核心对象SqlSessionFactory的获取方式。   
&emsp;&emsp; SqlSessionFactory对象的实例可以通过SqlSessionFactoryBuilder对象来构建，而SqlSessionFactoryBuilder对象则可以通过XML配置文件或一个预先定义好的Configuration实例构建SqlSessionFactory的实例，通过XML配置文件构建出的SqlSessionFactory实例，其代码如下：  
```JAVA
// 读取配置文件
InputStream inputStream = Resources.getResourceAsStream("配置文件位置");
// 根据配置文件构建SqlSessionFactory
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
```
2.请简述MyBatis映射文件中的主要元素及其作用。  
```PYTHON
<select>: 用于映射查询语句，可自定义参数，返回结果集等  
<insert>: 用于映射插入语句，执行后返回一个整数，代表插入的条数  
<update>: 用于映射更新语句，执行后返回一个整数，代表更新的条数  
<delete>: 用于映射删除语句，执行后返回一个整数，代表删除的条数  
<sql>: 用于定义一部分SQL，然后可被其他语句引用此SQL  
<cache>: 用于给定命名空间的缓存配置  
<cache-ref>: 用于其他命名空间缓存配置的引用  
<resultMap>: 用于描述如何从数据库结果集中加载对象
```
