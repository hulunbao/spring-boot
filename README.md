# 基于springboot的博客系统
---
## Thymeleaf实战
### API设计  
* GET/users : 返回用于展示用户列表的list.html界面.
* GET/users/{id} : 放回用于展示现用户的view.html界面.
* GET/users/form : 返回用于新增或者修改用户的form.html界面.  
* POST/users : 新增或修改用户,成功后重定向到list.html界面.  
* GET/users/delete/{id} : 根据id删除相应的用户数据,成功后重定向到list.html界面.  
* GET/users/modify/{id} : 根据id过去相应的用户数据,并返回form.html界面用来执行修改.
