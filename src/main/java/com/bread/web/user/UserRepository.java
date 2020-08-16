package com.bread.web.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {
    @Query("select m from User m where userId = :userId and password = :password")
    User findUser(String userId, String password);
}