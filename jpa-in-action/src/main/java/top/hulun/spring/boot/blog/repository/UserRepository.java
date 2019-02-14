/**
 *
 */
package top.hulun.spring.boot.blog.repository;

import org.springframework.data.repository.CrudRepository;
import top.hulun.spring.boot.blog.domain.User;

import java.util.List;

/**
 * UserRepository 接口
 *
 * @since 19-1-20 上午9:50
 * @author hulun
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
