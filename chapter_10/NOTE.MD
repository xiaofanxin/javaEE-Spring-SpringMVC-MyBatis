### 1.请简述MyBatis与Spring整合所需要的JAR包的种类。  
&emsp;&emsp;Spring框架所需的JAR包  
&emsp;&emsp;MyBatis框架所需的JAR包  
&emsp;&emsp;Spring与MyBatis整合的中间JAR包  
&emsp;&emsp;JDBC数据库驱动所需的JAR包  
&emsp;&emsp;数据源所需的JAR包  
### 2.请简述MapperFactoryBean与MapperScannerConfigurer的作用。  
&emsp;&emsp;MapperFactoryBean是MyBatis-Spring团队提供的一个用于根据Mapper接口生成Mapper对象的类，通过MapperFactoryBean可以配置接口文件以及注入SqlSessionfactory，从而完成一个Bean的实例化。  
&emsp;&emsp;MapperScannerConfigurer是MyBatis-Spring团队提供的一种用于以自动扫描形式来配置MyBatis中映射器的类，可以通过配置包路径来自动扫描包接口生成映射器，这使得开发人员可以在编写很少代码的情况下，完成对映射器的配置，从而提高开发效率。
