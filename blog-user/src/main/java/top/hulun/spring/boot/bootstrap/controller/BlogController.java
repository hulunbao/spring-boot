/**
 *
 */
package top.hulun.spring.boot.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Blog 控制器
 *
 * @since 19-3-12 下午10:37
 * @author hulun
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping
    public String listBlog(@RequestParam(value="order",required=false,defaultValue="new") String order,
                           @RequestParam(value="keyword",required=false) String keyword){
        System.out.println("order:"+order+"keyword"+keyword);
        return "redirct:/index?order="+order+"&keyword="+keyword;
    }
}
