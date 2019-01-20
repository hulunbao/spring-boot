/**
 *
 */
package top.hulun.spring.boot.blog.repository;

import top.hulun.spring.boot.blog.domain.User;

import java.util.List;

/**
 * UserRepository 接口
 *
 * @since 19-1-20 上午9:50
 * @author hulun
 */
public interface UserRepository {
    /**
     * 创建用户或修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void delete(Long id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUsers();
}
