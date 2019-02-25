package top.hulun.spring.boot.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.hulun.spring.boot.blog.domain.EsBlog;

/**
 * EsBlog Repository 接口.
 * @author hulun
 * @since 19-2-25 下午11:33
 */

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {

    /**
     * 分页查询博客
     * @param title
     * @param summary
     * @param content
     * @param pageable
     * @return
     */
    Page<EsBlog> findDistinctByContentContainingOrSummaryContainingOrContentContaining(String title, String summary, String content, Pageable pageable);
}
