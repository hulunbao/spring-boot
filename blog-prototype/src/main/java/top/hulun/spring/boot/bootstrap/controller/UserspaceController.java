/**
 *
 */
package top.hulun.spring.boot.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户主页空间控制器
 *
 * @since 19-3-12 下午11:02
 * @author hulun
 */
@Controller
@RequestMapping("/u")
public class UserspaceController {

    @GetMapping("/{username}")
    public String userSpace(@PathVariable("username") String username){
        System.out.println("username"+username);
        return "u";
    }

    @GetMapping("/{username}/blogs")
    public String listBlogByOrder(@PathVariable("username") String username,
                                  @RequestParam(value="order",required=false,defaultValue="new") String order,
                                  @RequestParam(value="category",required=false) Long category,
                                  @RequestParam(value="keyword",required=false) String keyword){
        if(category != null){
            System.out.println("category:" + category);
            System.out.println("selflink:" + "redirct:/u/"+ username + "/blog?order="+order);
            return "/u";
        }else if(keyword != null && keyword.isEmpty() == false){
            System.out.println("keyword:"+ keyword);
            System.out.println("selflink:" + "redirect:/u/"+username + "/blogs?keyword="+keyword);
            return "/u";
        }

        System.out.println("order:"+ order);
        System.out.println("selflink:" + "redirct:/u/" + username + "/blogs?order="+order);
        return "/u";
    }

    @GetMapping("/{username}/blogs/{id}")
    public String listBlogByOrder(@PathVariable("id") Long id){

        System.out.println("blogId:" + id);
        return "/blog";
    }

    @GetMapping("/{username}/blogs/edit")
    public String editBlog(){
        return "/blogedit";
    }
}
