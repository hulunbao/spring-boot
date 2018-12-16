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
2.进入项目的根目录执行gradle build构建项目  
3.执行java -jar build/libs/下面的jar包执行我们构建的项目  
4.访问localhost:8080
### 扩展学习
* [Java编程要点](https://github.com/waylau/essential-java)  
* [Gradle 3用户指南](https://github.com/waylau/gradle-3-user-guide)
## Thymeleaf实战  
### API设计  
* GET/users : 返回用于展示用户列表的list.html界面.  
* GET/users/{id} : 放回用于展示现用户的view.html界面.  
* GET/users/form : 返回用于新增或者修改用户的form.html界面.  
* POST/users : 新增或修改用户,成功后重定向到list.html界面.  
* GET/users/delete/{id} : 根据id删除相应的用户数据,成功后重定向到list.html界面.  
* GET/users/modify/{id} : 根据id过去相应的用户数据,并返回form.html界面用来执行修改.  
