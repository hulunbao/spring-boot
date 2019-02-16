# 基于springboot的博客系统  
### 功能  
* 注册博文,发博客,评论,点赞,全文检索,文件上传...  
### 技术  
* 前端,后端,数据库,NoSql,文件存储,大数据...  
### 环境
* java 8  
* gradle 4.9  
### 写一个hello world项目
1.[start.spring.io](https://start.spring.io/)初始化一个项目  
![start.spring.io](/image/Selection_002.png)
2.进入项目的根目录执行gradle build构建项目  
3.执行java -jar build/libs/下面的jar包执行我们构建的项目  
4.访问localhost:8080
### 扩展学习
* [Java编程要点](https://github.com/waylau/essential-java)  
* [Gradle 3用户指南](https://github.com/waylau/gradle-3-user-guide)  
### Thymeleaf  
* java模板引擎，能处理html,xml,javascript,css,和纯文本  
### Thymeleaf与springboot集成  
#### 环境  
* Tymeleaf 3.0.3 RELEASE  
* Tymeleaf Layout Dialect 2.2.0
#### 修改build.gradlle
### Thymeleaf
#### API设计  
* GET/users : 返回用于展示用户列表的list.html界面.  
* GET/users/{id} : 放回用于展示现用户的view.html界面.  
* GET/users/form : 返回用于新增或者修改用户的form.html界面.  
* POST/users : 新增或修改用户,成功后重定向到list.html界面.  
* GET/users/delete/{id} : 根据id删除相应的用户数据,成功后重定向到list.html界面.  
* GET/users/modify/{id} : 根据id过去相应的用户数据,并返回form.html界面用来执行修改.  

#### 后台编码
* 实体User  
* 资源库UserRepository  
* 控制器UserController  
### 数据持久化
* JPA  
> JPA(Java Persistence API) 是用于管理JavaEE和JavaSE环境中的持久化，以及对象/关系映射的Java API  
#### 实体  
* 实体表示关系型数据库中的表
* 每个实体实例对应该表中的行
* 类必须用javaxpersistence.Entity注解  
* 类必须有一个public或者protected的无惨构造函数
* 实体实例被当做值以分离对象方式进行传递（序列化），则该类必须实现Serializable接口
* 实体必须要有唯一的对象标识符：简单主键（javax.persistence.Id)，复合主键（javax.persistence.EmbeddedId和javax.persistence.IdClass）  
#### 关系
* 一对一
* 一对多
* 多对一
* 多对多

####EntityManager
数据持久化接口  

* 定义用于持久化上下文交互的方法  
* 创建和删除持久实体实例，通过实体的主键查找实体  
* 允许在实体上运行查询  

#### Spring Data JPA
* 更大的Spring Data 家族的一部分  
* 基于JPA的数据访问层的增强支持  
* 更容易构建基于使用Spring的数据访问技术栈的应用程序  
#### Spring Data JPA 常用接口
* CrudRepository  
![CrudRepository](/image/Selection_001.png)

	
