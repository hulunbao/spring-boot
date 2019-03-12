package top.hulun.spring.boot.bootstrap.repository;

import org.springframework.data.repository.CrudRepository;

import top.hulun.spring.boot.bootstrap.domain.User;

/**
 * 用户仓库.
 *
 * @since 1.0.0 2019年3月2日
 * @author hulun
 */
public interface UserRepository extends CrudRepository<User, Long>{
}
