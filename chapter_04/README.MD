## MySQL连接出现问题
+ 字符集问题  
&emsp;&emsp;可以在url后添加?characterEncoding=utf-8
+ 时区问题  
&emsp;&emsp;可以在url后添加serverTimezone=UTC，若有多个参数用&隔开；修改完之后还存在时区问题可以试试以下方式解决：
  + 一次性方法（即电脑重启失效）：在命令行登陆root，
    ```
    > set global time_zone = '+8:00';  ##修改mysql全局时区为北京时间，即我们所在的东8区
    > set time_zone = '+8:00';  ##修改当前会话时区
    > flush privileges;  #立即生效
    ```
  + 永久性方法  
  首先找到安装MySQL所在的文件中的my.ini，以记事本的方式打开，添加以下设置并保存。  
  ![配置my.ini](https://github.com/xiaofanxin/image/blob/master/%E9%85%8D%E7%BD%AEmy.ini.png?raw=true)
+ 数据库连接驱动的方式不适用  
&emsp;&emsp;将驱动名称改为com.mysql.cj.jdbc.Driver，并添加mysql-connector-java-8.0.15.jar包到lib中。


