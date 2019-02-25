/**
 *
 */
package top.hulun.spring.boot.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.hulun.spring.boot.blog.domain.EsBlog;
import top.hulun.spring.boot.blog.repository.EsBlogRepository;
import java.util.List;

/**
 * Blog 控制器
 *
 * @since 19-2-26 上午12:19
 * @author hulun
 */

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private EsBlogRepository esBlogRepository;

    @GetMapping
    public List<EsBlog> list(@RequestParam(value = "title") String title,
                             @RequestParam(value = "summary") String summary,
                             @RequestParam(value = "content") String content,
                             @RequestParam(value = "pageIndex",defaultValue = "0") int pageIndex,
                             @RequestParam(value = "pageSize",defaultValue = "10") int pageSize) {

        // 数据实在Test初始化
        Pageable pageable = new PageRequest(pageIndex, pageSize);
        Page<EsBlog> page = esBlogRepository.findDistinctByContentContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        return page.getContent();

    }

}
