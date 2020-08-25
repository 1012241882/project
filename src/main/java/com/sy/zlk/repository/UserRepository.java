package com.sy.zlk.repository;


import com.sy.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsernameAndPassword(String username,String password);

    User findByUsername(String username);
}
