/**
 *
 */
package top.hulun.spring.boot.blog.repository;

import org.springframework.stereotype.Repository;
import top.hulun.spring.boot.blog.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * User Repository
 *
 * @since 19-1-20 上午10:04
 * @author hulun
 */
@Repository
public class UserRepositoryImpl implements UserRepository{
    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<>();
    public UserRepositoryImpl() {
        super();
    }

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();
        if (id == null){ // 新建
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id,user);
        return user;
    }

    @Override
    public void delete(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUsers() {
        return new ArrayList<User>(this.userMap.values());
    }
}
